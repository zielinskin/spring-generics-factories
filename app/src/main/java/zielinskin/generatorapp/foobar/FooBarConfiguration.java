package zielinskin.generatorapp.foobar;


import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@Configuration
@Component("zielinskin.generatorapp.foobar")
@EntityScan(basePackages = {"zielinskin.generatorapp.foobar"})
@EnableJpaRepositories(basePackages = {"zielinskin.generatorapp.foobar"})
class FooBarConfiguration {
    @Bean
    public GroupedOpenApi foobarDocket() {
        return GroupedOpenApi.builder()
                .group("FooBar")
                .pathsToMatch("/foobars/**")
                .build();
    }
}
