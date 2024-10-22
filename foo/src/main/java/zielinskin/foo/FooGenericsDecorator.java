package zielinskin.foo;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsDecorator;

import java.util.Map;

@Service
class FooGenericsDecorator implements GenericsDecorator<FooGenericsDecoratable, Integer> {
    private final FooRepository fooRepository;

    public FooGenericsDecorator(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @Override
    public <T extends FooGenericsDecoratable, D extends Integer> void decorate(Map<D, T> genericsBuilders) {
        fooRepository.findAllById((Iterable<Integer>) genericsBuilders.keySet())
                .forEach(fooEntity ->
                        genericsBuilders.get(fooEntity.getId())
                                .setFoo(fooEntity.getFoo()));
    }
}