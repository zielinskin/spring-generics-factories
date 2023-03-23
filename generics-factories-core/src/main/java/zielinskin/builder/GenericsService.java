package zielinskin.builder;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public abstract class GenericsService<T, I, B extends GenericsBuilder<T, I>>
        implements GenericsServiceClient<T,I> {
    private final GenericsBuilderFactory<B, I> genericsBuilderFactory;
    private final List<GenericsDecorator<? super B>> genericsDecorators;

    public GenericsService(GenericsBuilderFactory<B, I> genericsBuilderFactory,
                           List<GenericsDecorator<? super B>> genericsDecorators) {
        this.genericsBuilderFactory = genericsBuilderFactory;
        this.genericsDecorators = genericsDecorators;
    }

    public T get(I id) {
        return get(Collections.singleton(id)).stream()
                .findFirst()
                .orElse(null);
    }

    public List<T> get(Collection<I> ids) {
        Collection<B> genericsBuilders = ids.stream()
                .map(genericsBuilderFactory::create)
                .collect(Collectors.toList());

        genericsDecorators.forEach(decorator ->
                decorator.decorate(genericsBuilders));

        return genericsBuilders.stream()
                .map(GenericsBuilder::build)
                .collect(Collectors.toList());
    }
}
