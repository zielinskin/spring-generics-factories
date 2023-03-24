package zielinskin.builder;

import java.util.Collection;

public interface GenericsDecorator<B> {
    <T extends B> void decorate(Collection<T> decoratables);
}