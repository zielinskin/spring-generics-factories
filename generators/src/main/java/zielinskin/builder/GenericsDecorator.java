package zielinskin.builder;

import java.util.Collection;

public interface GenericsDecorator<K extends GenericsBuilder<?>> {
    <T> void decorate(Collection<GenericsBuilder<T>> genericsBuilders);
}
