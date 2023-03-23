package zielinskin.bar;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsBuilder;
import zielinskin.builder.GenericsDecorator;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
class BarGenericsDecorator extends GenericsDecorator<BarGenericsBuilder> {
    private final BarRepository barRepository;

    public BarGenericsDecorator(BarRepository barRepository) {
        this.barRepository = barRepository;
    }

    @Override
    public void decorateButWithoutTypeErasure(Collection<BarGenericsBuilder> genericsBuilders) {
        Map<Integer, BarGenericsBuilder> genericsBuilderMap = genericsBuilders.stream()
                .collect(Collectors.toMap(
                        BarGenericsBuilder::getId,
                        Function.identity()));

        barRepository.findAllById(genericsBuilderMap.keySet())
                .forEach(fooEntity ->
                        genericsBuilderMap.get(fooEntity.getId())
                                .setBar(fooEntity.getBar()));
    }
}
