package zielinskin.generatorapp.logic;

import org.springframework.stereotype.Service;
import zielinskin.generatorapp.data.FooRepository;
import zielinskin.generators.Decoratable;
import zielinskin.generators.Decorator;

@Service
public class FooDecorator implements Decorator<Decoratable<Foo>> {
    private final FooRepository fooRepository;

    public FooDecorator(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    public void decorate(Decoratable<Foo> toDecorate) {
        fooRepository.findById(toDecorate.getId())
                .ifPresent(fooEntity ->
                        ((FooDecoratable<Foo>) toDecorate).setFoo(fooEntity.getFoo()));
    }
}