package zielinskin.builder;

import java.util.Map;

public interface GenericsDecorator<D, S> {
    <T extends D, I extends S> void decorate(Map<I, T> decoratables);
}