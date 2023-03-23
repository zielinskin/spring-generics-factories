package zielinskin.foo;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsBuilderFactory;
import zielinskin.builder.GenericsDecorator;
import zielinskin.builder.GenericsService;

import java.util.List;

@Service
class FooGenericsService extends GenericsService<Foo, Integer, FooGenericsBuilder> {
    public FooGenericsService(GenericsBuilderFactory<FooGenericsBuilder, Integer> genericsBuilderFactory,
                              List<GenericsDecorator<? super FooGenericsBuilder>> genericsDecorators) {
        super(genericsBuilderFactory, genericsDecorators);
    }
}
