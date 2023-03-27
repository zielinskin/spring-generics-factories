package zielinskin.builder;

import java.util.Map;

public interface GenericsDecorator<B, I> {
    <T extends B, D extends I> void decorate(Map<D, T> decoratables);
}