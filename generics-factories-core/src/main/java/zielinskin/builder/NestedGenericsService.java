package zielinskin.builder;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class NestedGenericsService<T, I, D extends Identifiable<I>, B extends GenericsBuilder<T>>
        implements GenericsServiceClient<T, I> {
    private final GenericsServiceClient<D, I> genericsServiceClient;
    private final GenericsBuilderFactory<B, D> genericsBuilderFactory;
    private final List<GenericsDecorator<? super B, ? super D>> genericsDecorators;

    public NestedGenericsService(GenericsServiceClient<D, I> genericsServiceClient,
                           GenericsBuilderFactory<B, D> genericsBuilderFactory,
                           List<GenericsDecorator<? super B, ? super D>> genericsDecorators) {
        this.genericsServiceClient = genericsServiceClient;
        this.genericsBuilderFactory = genericsBuilderFactory;
        this.genericsDecorators = genericsDecorators;
    }

    public Optional<T> get(I id) {
        return get(Collections.singleton(id)).stream()
                .findFirst();
    }

    public List<T> get(Collection<I> ids) {
        List<D> dataObjects = genericsServiceClient.get(ids);

        Map<D, B> genericsBuilders = dataObjects.stream()
                .collect(Collectors.toMap(Function.identity(),
                        genericsBuilderFactory::create));

        genericsDecorators.forEach(decorator ->
                decorator.decorate(genericsBuilders));

        return genericsBuilders.values().stream()
                .map(GenericsBuilder::build)
                .collect(Collectors.toList());
    }
}