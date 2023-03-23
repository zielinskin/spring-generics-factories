package zielinskin.builder;

public interface GenericsBuilderFactory<T, I> {
    T create(I id);
}
