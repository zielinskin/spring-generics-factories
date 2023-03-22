package zielinskin.generatorapp.logic;

import org.springframework.stereotype.Service;
import zielinskin.generators.DataService;
import zielinskin.generators.Decoratable;
import zielinskin.generators.DecoratableFactory;
import zielinskin.generators.Decorator;

import java.util.List;

@Service
public class FooDataService extends DataService<Foo> {
    public FooDataService(DecoratableFactory<? extends Decoratable<Foo>> decoratableFactory,
                          List<Decorator<Decoratable<? super Foo>>> decorators) {
        super(decoratableFactory, decorators);
    }
}
