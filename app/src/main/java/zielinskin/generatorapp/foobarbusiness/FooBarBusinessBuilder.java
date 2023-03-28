package zielinskin.generatorapp.foobarbusiness;

import zielinskin.builder.GenericsBuilder;
import zielinskin.foobar.FooBar;

class FooBarBusinessBuilder implements FooOrBarDecoratable, GenericsBuilder<FooBarBusinesss> {
    private final FooBar fooBar;
    private String fooOrBar;

    public FooBarBusinessBuilder(FooBar fooBar) {
        this.fooBar = fooBar;
    }

    @Override
    public void setFooOrBar(String fooOrBar) {
        this.fooOrBar = fooOrBar;
    }

    @Override
    public FooBarBusinesss build() {
        return new FooBarBusinesss(fooBar.getId(),
                fooOrBar);
    }
}
