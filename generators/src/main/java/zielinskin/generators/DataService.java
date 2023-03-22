package zielinskin.generators;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DataService<T> {
    private final DecoratableFactory<? extends Decoratable<T>> decoratableFactory;
    private final List<Decorator<Decoratable<? super T>>> decorators;

    public DataService(DecoratableFactory<? extends Decoratable<T>> decoratableFactory,
                       List<Decorator<Decoratable<? super T>>> decorators) {
        this.decoratableFactory = decoratableFactory;
        this.decorators = decorators;
    }

    public T get(Integer id) {
        Decoratable<T> decoratable = decoratableFactory.create(id);

        decorators.forEach(decorator ->
                decorator.decorate(decoratable));

        return decoratable.build();
    }
}
