package zielinskin.generatorapp.foobar;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsBuilderFactory;

@Service
class FooBarGenericsBuilderFactory implements GenericsBuilderFactory<FooBarGenericsBuilder, Integer> {
    @Override
    public FooBarGenericsBuilder create(Integer seed) {
        return new FooBarGenericsBuilder(seed);
    }
}
