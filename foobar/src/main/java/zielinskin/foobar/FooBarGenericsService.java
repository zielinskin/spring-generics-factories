package zielinskin.foobar;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsBuilderFactory;
import zielinskin.builder.GenericsDecorator;
import zielinskin.builder.GenericsService;

import java.util.List;

@Service
class FooBarGenericsService extends GenericsService<FooBar, Integer, FooBarGenericsBuilder> {
    public FooBarGenericsService(GenericsBuilderFactory<FooBarGenericsBuilder, Integer> genericsBuilderFactory,
                                 List<GenericsDecorator<? super FooBarGenericsBuilder, Integer>> genericsDecorators) {
        super(genericsBuilderFactory, genericsDecorators);
    }
}
