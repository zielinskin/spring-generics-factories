package zielinskin.foobar;


import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import zielinskin.bar.BarConfiguration;
import zielinskin.foo.FooConfiguration;

@Configuration
@ComponentScan("zielinskin.foobar")
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class FooBarConfiguration {
    @Bean
    public GroupedOpenApi foobarDocket() {
        return GroupedOpenApi.builder()
                .group("FooBar")
                .pathsToMatch("/foobars/**")
                .build();
    }
}
