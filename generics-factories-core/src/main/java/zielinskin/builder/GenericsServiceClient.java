package zielinskin.builder;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface GenericsServiceClient <T, I> {
    Optional<T> get(I id);

    List<T> get(Collection<I> ids);
}