package zielinskin.bar;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsDecorator;

import java.util.Map;

@Service
class BarGenericsDecorator implements GenericsDecorator<BarGenericsDecoratable, Integer> {
    private final BarRepository barRepository;

    public BarGenericsDecorator(BarRepository barRepository) {
        this.barRepository = barRepository;
    }

    @Override
    public <T extends BarGenericsDecoratable, D extends Integer> void decorate(Map<D, T> genericsBuilders) {
        barRepository.findAllById((Iterable<Integer>) genericsBuilders.keySet())
                .forEach(barEntity ->
                        genericsBuilders.get(barEntity.getId())
                                .setBar(barEntity.getBar()));
    }
}
