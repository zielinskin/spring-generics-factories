package zielinskin.foo;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsBuilderFactory;

@Service
class FooGenericsBuilderFactory implements GenericsBuilderFactory<FooGenericsBuilder, Integer> {
    @Override
    public FooGenericsBuilder create(Integer seed) {
        return new FooGenericsBuilder(seed);
    }
}
