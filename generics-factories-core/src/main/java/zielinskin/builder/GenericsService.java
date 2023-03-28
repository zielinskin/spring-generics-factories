package zielinskin.builder;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public abstract class GenericsService<T, I, B extends GenericsBuilder<T>>
        implements GenericsServiceClient<T,I> {
    private final GenericsBuilderFactory<B, I> genericsBuilderFactory;
    private final List<GenericsDecorator<? super B, I>> genericsDecorators;

    public GenericsService(GenericsBuilderFactory<B, I> genericsBuilderFactory,
                           List<GenericsDecorator<? super B, I>> genericsDecorators) {
        this.genericsBuilderFactory = genericsBuilderFactory;
        this.genericsDecorators = genericsDecorators;
    }

    public Optional<T> get(I id) {
        return get(Collections.singleton(id)).stream()
                .findFirst();
    }

    public List<T> get(Collection<I> ids) {
        Map<I, B> genericsBuilders = ids.stream()
                .collect(Collectors.toMap(Function.identity(),
                        genericsBuilderFactory::create));

        genericsDecorators.forEach(decorator ->
                decorator.decorate(genericsBuilders));

        return genericsBuilders.values().stream()
                .map(GenericsBuilder::build)
                .collect(Collectors.toList());
    }
}
