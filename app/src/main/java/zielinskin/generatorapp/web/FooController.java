package zielinskin.generatorapp.web;

import org.springframework.web.bind.annotation.*;
import zielinskin.builder.GenericsService;
import zielinskin.generatorapp.logic.foo.Foo;
import zielinskin.generatorapp.logic.foobar.FooBar;

@RestController
@RequestMapping("/")
class FooController {
    private final GenericsService<FooBar> service;
    private final GenericsService<Foo> fooService;

    public FooController(GenericsService<FooBar> service,
                         GenericsService<Foo> fooService) {
        this.service = service;
        this.fooService = fooService;
    }

    @GetMapping("/foobars/{id}")
    public FooBar get(@PathVariable Integer id) {
        return service.get(id);
    }


    @GetMapping("/foos/{id}")
    public Foo getFoo(@PathVariable Integer id) {
        return fooService.get(id);
    }
}