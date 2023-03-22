package zielinskin.generatorapp.logic;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsBuilder;
import zielinskin.builder.GenericsBuilderFactory;
import zielinskin.builder.GenericsDecorator;
import zielinskin.builder.GenericsService;

import java.util.List;

@Service
public class FooBarGenericsService extends GenericsService<FooBar> {
    public FooBarGenericsService(GenericsBuilderFactory<? extends GenericsBuilder<FooBar>>
                                         genericsBuilderFactory,
                                 List<GenericsDecorator<GenericsBuilder<? super FooBar>>> genericsDecorators) {
        super(genericsBuilderFactory, genericsDecorators);
    }
}
