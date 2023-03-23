package zielinskin.foo;

import zielinskin.builder.Identifiable;

public interface FooGenericsDecoratable extends Identifiable<Integer> {
    void setFoo(String foo);
}
