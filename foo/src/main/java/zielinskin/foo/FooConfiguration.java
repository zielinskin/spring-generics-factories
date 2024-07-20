package zielinskin.foo;


import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("zielinskin.foo")
@EntityScan(basePackages = {"zielinskin.foo"})
@EnableJpaRepositories(basePackages = {"zielinskin.foo"})
public class FooConfiguration {
    @Bean
    public GroupedOpenApi fooDocket() {
        return GroupedOpenApi.builder()
                .group("Foo")
                .pathsToMatch("/foos/**")
                .build();
    }
}
