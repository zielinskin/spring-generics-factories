package zielinskin.generatorapp.logic;

import org.springframework.stereotype.Service;
import zielinskin.generators.DataService;
import zielinskin.generators.Decoratable;
import zielinskin.generators.DecoratableFactory;
import zielinskin.generators.Decorator;

import java.util.List;

@Service
public class FooBarDataService extends DataService<FooBar> {
    public FooBarDataService(DecoratableFactory<? extends Decoratable<FooBar>>
                                     decoratableFactory,
                             List<Decorator<Decoratable<? super FooBar>>> decorators) {
        super(decoratableFactory, decorators);
    }
}
