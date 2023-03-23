package zielinskin.builder;

import java.util.Collection;
import java.util.List;

public interface GenericsServiceClient <T, I> {
    T get(I id);

    List<T> get(Collection<I> ids);
}