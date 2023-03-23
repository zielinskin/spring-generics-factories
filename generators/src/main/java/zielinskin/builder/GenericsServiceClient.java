package zielinskin.builder;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public interface GenericsServiceClient <T, I> {
    public T get(I id);

    public List<T> get(Collection<I> ids);
}