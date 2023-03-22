package zielinskin.foo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zielinskin.builder.GenericsService;

@RestController
class FooController {
    private final GenericsService<Foo> fooService;

    public FooController(GenericsService<Foo> fooService) {
        this.fooService = fooService;
    }

    @GetMapping("/foos/{id}")
    public Foo get(@PathVariable Integer id) {
        return fooService.get(id);
    }
}