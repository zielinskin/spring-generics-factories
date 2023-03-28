package zielinskin.foobar;

import zielinskin.bar.BarGenericsDecoratable;
import zielinskin.builder.GenericsBuilder;
import zielinskin.foo.FooGenericsDecoratable;

class FooBarGenericsBuilder implements FooGenericsDecoratable, BarGenericsDecoratable, GenericsBuilder<FooBar> {
    private final Integer id;
    private String bar;
    private String foo;

    public FooBarGenericsBuilder(Integer id) {
        this.id = id;
    }

    @Override
    public void setBar(String bar) {
        this.bar = bar;
    }

    @Override
    public void setFoo(String foo) {
        this.foo = foo;
    }

    @Override
    public FooBar build() {
        return new FooBar(id,
                foo,
                bar);
    }
}
