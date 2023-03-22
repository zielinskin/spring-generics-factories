package zielinskin.generatorapp.logic;

public class FooBarDecoratable implements FooDecoratable<FooBar>, BarDecoratable<FooBar> {
    private final Integer id;
    private String bar;
    private String foo;

    public FooBarDecoratable(Integer id) {
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
