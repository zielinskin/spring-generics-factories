package zielinskin.generatorapp.foobar;


import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.*;
import zielinskin.bar.BarConfiguration;
import zielinskin.foo.FooConfiguration;

@Configuration
@ComponentScan("zielinskin.generatorapp.foobar")
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
class FooBarConfiguration {
    @Bean
    public GroupedOpenApi foobarDocket() {
        return GroupedOpenApi.builder()
                .group("FooBar")
                .pathsToMatch("/foobars/**")
                .build();
    }
}
