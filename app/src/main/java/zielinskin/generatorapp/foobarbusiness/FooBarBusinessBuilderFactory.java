package zielinskin.generatorapp.foobarbusiness;

import org.springframework.stereotype.Component;
import zielinskin.builder.GenericsBuilderFactory;
import zielinskin.foobar.FooBar;

@Component
class FooBarBusinessBuilderFactory implements GenericsBuilderFactory<FooBarBusinessBuilder, FooBar> {
    @Override
    public FooBarBusinessBuilder create(FooBar seed) {
        return new FooBarBusinessBuilder(seed);
    }
}
