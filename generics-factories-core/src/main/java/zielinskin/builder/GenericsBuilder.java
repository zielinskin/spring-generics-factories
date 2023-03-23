package zielinskin.builder;

public interface GenericsBuilder<T, I> extends Identifiable<I> {
    T build();
}
