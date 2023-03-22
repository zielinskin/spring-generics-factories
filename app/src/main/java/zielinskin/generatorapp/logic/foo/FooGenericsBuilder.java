package zielinskin.generatorapp.logic.foo;

import zielinskin.builder.GenericsBuilder;

public interface FooGenericsBuilder<T extends Foo> extends GenericsBuilder<T> {
    void setFoo(String foo);
}
