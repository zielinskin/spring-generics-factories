package zielinskin.bar;

import zielinskin.builder.GenericsBuilder;
import zielinskin.builder.Identifiable;

public interface BarGenericsBuilder extends Identifiable<Integer> {
    void setBar(String bar);
}
