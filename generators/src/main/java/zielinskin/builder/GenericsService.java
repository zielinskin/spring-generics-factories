package zielinskin.builder;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public abstract class GenericsService<T, I,  K extends GenericsBuilder<T, I>> implements GenericsServiceClient<T,I> {
    private final GenericsBuilderFactory<K, I> genericsBuilderFactory;
    private final List<GenericsDecorator<? super K>> genericsDecorators;

    public GenericsService(GenericsBuilderFactory<K, I> genericsBuilderFactory,
                           List<GenericsDecorator<? super K>> genericsDecorators) {
        this.genericsBuilderFactory = genericsBuilderFactory;
        this.genericsDecorators = genericsDecorators;
    }

    public T get(I id) {
        return get(Collections.singleton(id)).stream()
                .findFirst()
                .orElse(null);
    }

    public List<T> get(Collection<I> ids) {
        Collection<K> genericsBuilders = ids.stream()
                .map(genericsBuilderFactory::create)
                .collect(Collectors.toList());

        genericsDecorators.forEach(decorator ->
                decorator.decorate(genericsBuilders));

        return genericsBuilders.stream()
                .map(GenericsBuilder::build)
                .collect(Collectors.toList());
    }
}
