package zielinskin.generators;

public interface Decorator<K extends Decoratable<?>> {
    void decorate(K toDecorate);
}
