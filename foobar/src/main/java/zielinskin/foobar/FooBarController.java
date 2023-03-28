package zielinskin.foobar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zielinskin.builder.GenericsServiceClient;

@RestController
class FooBarController {
    private final GenericsServiceClient<FooBar, Integer> service;

    public FooBarController(GenericsServiceClient<FooBar, Integer> service) {
        this.service = service;
    }

    @GetMapping("/foobars/{id}")
    public FooBar get(@PathVariable Integer id) {
        return service.get(id)
                .orElse(null);
    }

}