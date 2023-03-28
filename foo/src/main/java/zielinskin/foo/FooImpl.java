package zielinskin.foo;

class FooImpl implements Foo {
    private final Integer id;
    private final String foo;

    public FooImpl(Integer id, String foo) {
        this.id = id;
        this.foo = foo;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String getFoo() {
        return foo;
    }
}
