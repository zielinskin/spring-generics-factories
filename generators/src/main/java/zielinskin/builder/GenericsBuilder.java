package zielinskin.builder;

public interface GenericsBuilder<T, I> {
    I getId();

    T build();
}
