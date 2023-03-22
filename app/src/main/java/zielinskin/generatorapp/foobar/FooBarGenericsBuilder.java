package zielinskin.generatorapp.foobar;

import zielinskin.bar.BarGenericsBuilder;
import zielinskin.foo.FooGenericsBuilder;

class FooBarGenericsBuilder implements FooGenericsBuilder<FooBar>, BarGenericsBuilder<FooBar> {
    private final Integer id;
    private String bar;
    private String foo;

    public FooBarGenericsBuilder(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
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
