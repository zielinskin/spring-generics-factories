package zielinskin.generatorapp.logic;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsBuilderFactory;

@Service
public class FooGenericsBuilderFactory implements GenericsBuilderFactory<FooGenericsBuilder<Foo>> {
    @Override
    public FooGenericsBuilder<Foo> create(Integer id) {
        return new FooGenericsBuilderImpl(id);
    }
}
