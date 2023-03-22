package zielinskin.generatorapp.logic;

public class FooBar implements Foo, Bar {
    private final Integer id;
    private final String foo;
    private final String bar;

    public FooBar(Integer id, String foo, String bar) {
        this.id = id;
        this.foo = foo;
        this.bar = bar;
    }

    public Integer getId() {
        return id;
    }

    public String getFoo() {
        return foo;
    }

    public String getBar() {
        return bar;
    }
}
