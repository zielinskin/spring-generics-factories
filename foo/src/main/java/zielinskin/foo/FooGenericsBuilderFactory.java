package zielinskin.foo;

import org.springframework.stereotype.Service;
import zielinskin.builder.GenericsBuilderFactory;

@Service
class FooGenericsBuilderFactory implements GenericsBuilderFactory<FooGenericsBuilderImpl, Integer> {
    @Override
    public FooGenericsBuilderImpl create(Integer id) {
        return new FooGenericsBuilderImpl(id);
    }
}
