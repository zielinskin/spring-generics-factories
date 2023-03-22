package zielinskin.generatorapp.logic;

import org.springframework.stereotype.Service;
import zielinskin.generators.DecoratableFactory;

@Service
public class FooBarDecoratableFactory implements DecoratableFactory<FooBarDecoratable> {
    @Override
    public FooBarDecoratable create(Integer id) {
        return new FooBarDecoratable(id);
    }
}
