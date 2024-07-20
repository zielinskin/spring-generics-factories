package zielinskin.generatorapp.foobarbusiness;

import org.springframework.stereotype.Component;
import zielinskin.builder.GenericsDecorator;
import zielinskin.foobar.FooBar;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

@Component
class FooOrBarDecorator implements GenericsDecorator<FooOrBarDecoratable, FooBar> {
    @Override
    public <T extends FooOrBarDecoratable, I extends FooBar> void decorate(Map<I, T> decoratables) {
        decoratables.forEach((I foobar, T decoratable) ->
                decoratable.setFooOrBar(getFooOrBar(foobar)));
    }

    private String getFooOrBar(FooBar fooBar) {
        return Stream.of(fooBar.getBar(), fooBar.getFoo())
                .filter(Objects::nonNull) //min refuses to accept nulls, even with a null-safe comparator
                .min(Comparator.naturalOrder())
                .orElse(null);
    }
}
