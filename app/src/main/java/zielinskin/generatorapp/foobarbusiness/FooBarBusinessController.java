package zielinskin.generatorapp.foobarbusiness;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zielinskin.builder.GenericsServiceClient;

@RestController
public class FooBarBusinessController {
    private final GenericsServiceClient<FooBarBusinesss, Integer> service;

    public FooBarBusinessController(GenericsServiceClient<FooBarBusinesss, Integer> service) {
        this.service = service;
    }

    @GetMapping("/foobarbusinesses/{id}")
    public FooBarBusinesss get(@PathVariable Integer id) {
        return service.get(id)
                .orElse(null);
    }
}
