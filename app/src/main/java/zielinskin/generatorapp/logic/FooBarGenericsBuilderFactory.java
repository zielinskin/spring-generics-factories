package zielinskin.generatorapp.logic;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsBuilderFactory;

@Service
public class FooBarGenericsBuilderFactory implements GenericsBuilderFactory<FooBarGenericsBuilder> {
    @Override
    public FooBarGenericsBuilder create(Integer id) {
        return new FooBarGenericsBuilder(id);
    }
}