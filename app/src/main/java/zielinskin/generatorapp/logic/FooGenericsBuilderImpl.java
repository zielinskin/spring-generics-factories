package zielinskin.generatorapp.logic;

public class FooGenericsBuilderImpl implements FooGenericsBuilder<Foo> {
    private final Integer id;
    private String foo;

    public FooGenericsBuilderImpl(Integer id) {
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
