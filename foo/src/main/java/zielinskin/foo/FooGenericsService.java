package zielinskin.foo;

import org.springframework.stereotype.Service;
import zielinskin.builder.*;

import java.util.List;

@Service
class FooGenericsService extends GenericsService<Foo> {
    public FooGenericsService(GenericsBuilderFactory<? extends GenericsBuilder<Foo>> genericsBuilderFactory,
                              List<GenericsDecorator<? super Foo>> genericsDecorators) {
        super(genericsBuilderFactory, genericsDecorators);
    }
}