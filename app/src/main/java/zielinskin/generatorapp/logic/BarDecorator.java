package zielinskin.generatorapp.logic;

import org.springframework.stereotype.Service;
import zielinskin.generatorapp.data.BarRepository;
import zielinskin.generators.Decoratable;
import zielinskin.generators.Decorator;

@Service
public class BarDecorator implements Decorator<Decoratable<Bar>> {
    private final BarRepository barRepository;

    public BarDecorator(BarRepository barRepository) {
        this.barRepository = barRepository;
    }

    public void decorate(Decoratable<Bar> toDecorate) {
        barRepository.findById(toDecorate.getId())
                .ifPresent(fooEntity ->
                        ((BarDecoratable<Bar>) toDecorate).setBar(fooEntity.getBar()));
    }
}
