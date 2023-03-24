package zielinskin.builder;

import java.util.Collection;
import java.util.stream.Collectors;

public abstract class GenericsDecorator<B> {
    //todo: how do we avoid this?
    public void decorate(Collection<?> decoratables) {
        Collection<B> javaSucksCollection = decoratables.stream()
                .map(decoratable ->
                        (B) decoratable)
                .collect(Collectors.toSet());

        decorateButWithoutTypeErasure(javaSucksCollection);
    }

    protected abstract void decorateButWithoutTypeErasure(Collection<B> genericsBuilders);

}
