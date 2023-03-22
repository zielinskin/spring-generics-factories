package zielinskin.generatorapp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zielinskin.builder.GenericsService;
import zielinskin.generatorapp.logic.Foo;
import zielinskin.generatorapp.logic.FooBar;

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