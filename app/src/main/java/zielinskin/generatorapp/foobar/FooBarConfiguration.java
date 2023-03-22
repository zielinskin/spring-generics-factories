package zielinskin.generatorapp.foobar;


import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class FooBarConfiguration {
    @Bean
    public GroupedOpenApi foobarDocket() {
        return GroupedOpenApi.builder()
                .group("FooBar")
                .pathsToMatch("/foobars/**")
                .build();
    }
}
