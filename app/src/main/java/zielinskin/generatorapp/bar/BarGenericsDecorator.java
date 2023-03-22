package zielinskin.generatorapp.bar;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsBuilder;
import zielinskin.builder.GenericsDecorator;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
class BarGenericsDecorator implements GenericsDecorator<GenericsBuilder<Bar>> {
    private final BarRepository barRepository;

    public BarGenericsDecorator(BarRepository barRepository) {
        this.barRepository = barRepository;
    }

    @Override
    public <T> void decorate(Collection<GenericsBuilder<T>> genericsBuilders) {
        Map<Integer, GenericsBuilder<T>> genericsBuilderMap = genericsBuilders.stream()
                .collect(Collectors.toMap(
                        GenericsBuilder::getId,
                        Function.identity()));

        barRepository.findAllById(genericsBuilderMap.keySet())
                .forEach(fooEntity ->
                        ((BarGenericsBuilder<Bar>) genericsBuilderMap.get(fooEntity.getId()))
                                .setBar(fooEntity.getBar()));
    }
}
