package zielinskin.generatorapp.logic;

import zielinskin.generators.Decoratable;

public interface FooDecoratable<T extends Foo> extends Decoratable<T> {
    void setFoo(String foo);
}
