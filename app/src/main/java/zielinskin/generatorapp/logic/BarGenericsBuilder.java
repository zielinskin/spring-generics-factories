package zielinskin.generatorapp.logic;

import zielinskin.builder.GenericsBuilder;

public interface BarGenericsBuilder<T extends Bar> extends GenericsBuilder<T> {
    void setBar(String bar);
}
