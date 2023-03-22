package zielinskin.bar;

import zielinskin.builder.GenericsBuilder;

public interface BarGenericsBuilder<T extends Bar> extends GenericsBuilder<T> {
    void setBar(String bar);
}
