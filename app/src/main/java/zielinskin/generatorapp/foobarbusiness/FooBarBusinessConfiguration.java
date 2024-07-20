package zielinskin.generatorapp.foobarbusiness;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import zielinskin.foobar.FooBarConfiguration;

@Configuration
@ComponentScan("zielinskin.generatorapp.foobarbusiness")
@Import({
        FooBarConfiguration.class
})
public class FooBarBusinessConfiguration {
    @Bean
    public GroupedOpenApi fooBarBusinessDocket() {
        return GroupedOpenApi.builder()
                .group("FooBarBusiness")
                .pathsToMatch("/foobarbusinesses/**")
                .build();
    }
}
