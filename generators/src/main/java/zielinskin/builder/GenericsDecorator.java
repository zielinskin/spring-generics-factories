package zielinskin.builder;

import java.util.Collection;
import java.util.stream.Collectors;

public abstract class GenericsDecorator<K> {
    public void decorate(Collection<?> decoratables) {
        Collection<K> javaSucksCollection = decoratables.stream()
                .map(decoratable ->
                        (K) decoratable)
                .collect(Collectors.toSet());

        decorateButWithoutTypeErasure(javaSucksCollection);
    }

    protected abstract void decorateButWithoutTypeErasure(Collection<K> genericsBuilders);

}
