package zielinskin.builder;

public interface GenericsBuilder<T> {
    Integer getId();

    T build();
}
