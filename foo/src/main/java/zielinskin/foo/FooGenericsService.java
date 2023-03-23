package zielinskin.foo;

import org.springframework.stereotype.Service;
import zielinskin.builder.*;

import java.util.List;

@Service
class FooGenericsService extends GenericsService<Foo, Integer, FooGenericsBuilderImpl> {
    public FooGenericsService(GenericsBuilderFactory<FooGenericsBuilderImpl, Integer> genericsBuilderFactory,
                              List<GenericsDecorator<? super FooGenericsBuilderImpl>> genericsDecorators) {
        super(genericsBuilderFactory, genericsDecorators);
    }
}
