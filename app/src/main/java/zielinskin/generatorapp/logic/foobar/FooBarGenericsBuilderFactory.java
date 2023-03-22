package zielinskin.generatorapp.logic.foobar;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsBuilderFactory;

@Service
class FooBarGenericsBuilderFactory implements GenericsBuilderFactory<FooBarGenericsBuilder> {
    @Override
    public FooBarGenericsBuilder create(Integer id) {
        return new FooBarGenericsBuilder(id);
    }
}
