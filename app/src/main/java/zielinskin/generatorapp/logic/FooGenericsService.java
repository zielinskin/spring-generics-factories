package zielinskin.generatorapp.logic;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsBuilder;
import zielinskin.builder.GenericsBuilderFactory;
import zielinskin.builder.GenericsDecorator;
import zielinskin.builder.GenericsService;

import java.util.List;

@Service
public class FooGenericsService extends GenericsService<Foo> {
    public FooGenericsService(GenericsBuilderFactory<? extends GenericsBuilder<Foo>> genericsBuilderFactory,
                              List<GenericsDecorator<GenericsBuilder<? super Foo>>> genericsDecorators) {
        super(genericsBuilderFactory, genericsDecorators);
    }
}
