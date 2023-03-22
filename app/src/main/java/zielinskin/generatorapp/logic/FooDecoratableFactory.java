package zielinskin.generatorapp.logic;

import org.springframework.stereotype.Service;
import zielinskin.generators.DecoratableFactory;

@Service
public class FooDecoratableFactory implements DecoratableFactory<FooDecoratable<Foo>> {
    @Override
    public FooDecoratable<Foo> create(Integer id) {
        return new FooDecoratableImpl(id);
    }
}
