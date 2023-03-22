package zielinskin.builder;

import java.util.Collection;

public interface GenericsDecorator<K> {
    <T> void decorate(Collection<GenericsBuilder<T>> genericsBuilders);
}
