package zielinskin.generatorapp.logic.foo;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsBuilder;
import zielinskin.builder.GenericsDecorator;
import zielinskin.generatorapp.data.FooRepository;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
class FooGenericsDecorator implements GenericsDecorator<GenericsBuilder<Foo>> {
    private final FooRepository fooRepository;

    public FooGenericsDecorator(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @Override
    public <T> void decorate(Collection<GenericsBuilder<T>> genericsBuilders) {
        Map<Integer, GenericsBuilder<T>> genericsBuilderMap = genericsBuilders.stream()
                .collect(Collectors.toMap(
                        GenericsBuilder::getId,
                        Function.identity()));

        fooRepository.findAllById(genericsBuilderMap.keySet())
                .forEach(fooEntity ->
                        ((FooGenericsBuilder<Foo>) genericsBuilderMap.get(fooEntity.getId()))
                                .setFoo(fooEntity.getFoo()));
    }
}