package zielinskin.builder;

import java.util.Map;

public interface GenericsDecorator<B extends Identifiable<I>, I> {
    <T extends B> void decorate(Map<I, T> decoratables);
}