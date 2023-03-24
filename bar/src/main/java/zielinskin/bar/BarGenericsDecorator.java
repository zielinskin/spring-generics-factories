package zielinskin.bar;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsDecorator;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
class BarGenericsDecorator implements GenericsDecorator<BarGenericsDecoratable> {
    private final BarRepository barRepository;

    public BarGenericsDecorator(BarRepository barRepository) {
        this.barRepository = barRepository;
    }

    @Override
    public <T extends BarGenericsDecoratable> void decorate(Collection<T> genericsBuilders) {
        Map<Integer, BarGenericsDecoratable> genericsBuilderMap = genericsBuilders.stream()
                .collect(Collectors.toMap(
                        BarGenericsDecoratable::getId,
                        Function.identity()));

        barRepository.findAllById(genericsBuilderMap.keySet())
                .forEach(barEntity ->
                        genericsBuilderMap.get(barEntity.getId())
                                .setBar(barEntity.getBar()));
    }
}
