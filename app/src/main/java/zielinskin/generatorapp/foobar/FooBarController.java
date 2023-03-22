package zielinskin.generatorapp.foobar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zielinskin.builder.GenericsService;

@RestController
class FooBarController {
    private final GenericsService<FooBar> service;

    public FooBarController(GenericsService<FooBar> service) {
        this.service = service;
    }

    @GetMapping("/foobars/{id}")
    public FooBar get(@PathVariable Integer id) {
        return service.get(id);
    }

}