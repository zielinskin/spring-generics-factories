package zielinskin.generatorapp.logic.foobar;

import org.springframework.stereotype.Service;
import zielinskin.builder.*;

import java.util.List;

@Service
class FooBarGenericsService extends GenericsService<FooBar> {
    public FooBarGenericsService(GenericsBuilderFactory<? extends GenericsBuilder<FooBar>>
                                         genericsBuilderFactory,
                                 List<GenericsDecorator<GenericsBuilder<? super FooBar>>> genericsDecorators) {
        super(genericsBuilderFactory, genericsDecorators);
    }
}
