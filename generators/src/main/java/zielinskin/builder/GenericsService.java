package zielinskin.builder;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public abstract class GenericsService<T> {
    private final GenericsBuilderFactory<? extends GenericsBuilder<T>> genericsBuilderFactory;
    private final List<GenericsDecorator<? super T>> genericsDecorators;

    public GenericsService(GenericsBuilderFactory<? extends GenericsBuilder<T>> genericsBuilderFactory,
                           List<GenericsDecorator<? super T>> genericsDecorators) {
        this.genericsBuilderFactory = genericsBuilderFactory;
        this.genericsDecorators = genericsDecorators;
    }

    public T get(Integer id) {
        return get(Collections.singleton(id)).stream()
                .findFirst()
                .orElse(null);
    }

    public List<T> get(Collection<Integer> ids) {
        Collection<GenericsBuilder<T>> genericsBuilders = ids.stream()
                .map(genericsBuilderFactory::create)
                .collect(Collectors.toList());

        genericsDecorators.forEach(decorator ->
                decorator.decorate(genericsBuilders));

        return genericsBuilders.stream()
                .map(GenericsBuilder::build)
                .collect(Collectors.toList());
    }
}
