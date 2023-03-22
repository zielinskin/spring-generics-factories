package zielinskin.generatorapp.foo;


import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@Configuration
@Component("zielinskin.generatorapp.foo")
@EntityScan(basePackages = {"zielinskin.generatorapp.foo"})
@EnableJpaRepositories(basePackages = {"zielinskin.generatorapp.foo"})
class FooConfiguration {
    @Bean
    public GroupedOpenApi fooDocket() {
        return GroupedOpenApi.builder()
                .group("Foo")
                .pathsToMatch("/foos/**")
                .build();
    }
}
