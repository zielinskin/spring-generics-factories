package zielinskin.foo;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsDecorator;
import zielinskin.builder.Identifiable;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
class FooGenericsDecorator extends GenericsDecorator<FooGenericsDecoratable> {
    private final FooRepository fooRepository;

    public FooGenericsDecorator(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @Override
    public void decorateButWithoutTypeErasure(Collection<FooGenericsDecoratable> genericsBuilders) {
        Map<Integer, FooGenericsDecoratable> genericsBuilderMap = genericsBuilders.stream()
                .collect(Collectors.toMap(
                        Identifiable::getId,
                        Function.identity()));

        fooRepository.findAllById(genericsBuilderMap.keySet())
                .forEach(fooEntity ->
                        genericsBuilderMap.get(fooEntity.getId())
                                .setFoo(fooEntity.getFoo()));
    }
}