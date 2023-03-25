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
    public <T extends BarGenericsDecoratable> void decorate(Map<Integer, T> genericsBuilders) {
        barRepository.findAllById(genericsBuilders.keySet())
                .forEach(barEntity ->
                        genericsBuilders.get(barEntity.getId())
                                .setBar(barEntity.getBar()));
    }
}
