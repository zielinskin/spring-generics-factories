package zielinskin.generatorapp.foobar;

import org.springframework.stereotype.Service;
import zielinskin.builder.*;

import java.util.List;

@Service
class FooBarGenericsService extends GenericsService<FooBar, Integer, FooBarGenericsBuilder> {
    public FooBarGenericsService(GenericsBuilderFactory<FooBarGenericsBuilder, Integer> genericsBuilderFactory,
                                 List<GenericsDecorator<? super FooBarGenericsBuilder>> genericsDecorators) {
        super(genericsBuilderFactory, genericsDecorators);
    }
}
