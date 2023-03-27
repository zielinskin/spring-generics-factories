package zielinskin.builder;

public interface GenericsBuilderFactory<B, I> {
    B create(I seed);
}