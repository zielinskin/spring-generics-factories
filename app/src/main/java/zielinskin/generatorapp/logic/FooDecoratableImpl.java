package zielinskin.generatorapp.logic;

public class FooDecoratableImpl implements FooDecoratable<Foo> {
    private final Integer id;
    private String foo;

    public FooDecoratableImpl(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setFoo(String foo) {
        this.foo = foo;
    }

    @Override
    public Foo build() {
        return new FooImpl(id,
                foo);
    }
}
