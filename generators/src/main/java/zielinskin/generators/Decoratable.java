package zielinskin.generators;

public interface Decoratable<T> {
    Integer getId();

    T build();
}
