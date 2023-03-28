package zielinskin.generatorapp.foobarbusiness;

import org.springframework.stereotype.Service;
import zielinskin.builder.CompositeGenericsService;
import zielinskin.builder.GenericsBuilderFactory;
import zielinskin.builder.GenericsDecorator;
import zielinskin.builder.GenericsServiceClient;
import zielinskin.foobar.FooBar;

import java.util.List;

@Service
class FooBarBusinessService extends CompositeGenericsService<FooBarBusinesss, Integer, FooBar, FooBarBusinessBuilder> {
    public FooBarBusinessService(GenericsServiceClient<FooBar, Integer> genericsServiceClient,
                                 GenericsBuilderFactory<FooBarBusinessBuilder, FooBar> genericsBuilderFactory,
                                 List<GenericsDecorator<? super FooBarBusinessBuilder, ? super FooBar>> genericsDecorators) {
        super(genericsServiceClient, genericsBuilderFactory, genericsDecorators);
    }
}
