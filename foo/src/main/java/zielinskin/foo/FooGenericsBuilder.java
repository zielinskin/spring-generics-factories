package zielinskin.foo;

import zielinskin.builder.GenericsBuilder;

class FooGenericsBuilder implements FooGenericsDecoratable, GenericsBuilder<Foo, Integer> {
    private final Integer id;
    private String foo;

    public FooGenericsBuilder(Integer id) {
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
