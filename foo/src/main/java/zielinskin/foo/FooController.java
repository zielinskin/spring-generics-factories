package zielinskin.foo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zielinskin.builder.GenericsServiceClient;

@RestController
class FooController {
    private final GenericsServiceClient<Foo, Integer> fooService;

    public FooController(GenericsServiceClient<Foo, Integer> fooService) {
        this.fooService = fooService;
    }

    @GetMapping("/foos/{id}")
    public Foo get(@PathVariable(value = "id") Integer id) {
        return fooService.get(id)
                .orElse(null);
    }
}