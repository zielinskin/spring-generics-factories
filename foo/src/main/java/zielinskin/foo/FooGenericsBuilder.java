package zielinskin.foo;

import zielinskin.builder.GenericsBuilder;
import zielinskin.builder.Identifiable;

public interface FooGenericsBuilder extends Identifiable<Integer> {
    void setFoo(String foo);
}
