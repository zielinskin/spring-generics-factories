package zielinskin.builder;

import java.util.Map;

public interface GenericsDecorator<B, I> {
    <T extends B> void decorate(Map<I, T> decoratables);
}