package zielinskin.generatorapp.logic;

import zielinskin.generators.Decoratable;

public interface BarDecoratable<T extends Bar> extends Decoratable<T> {
    void setBar(String bar);
}
