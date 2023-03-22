package zielinskin.generatorapp;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan(basePackages = {"zielinskin.generatorapp.data"})
@EnableJpaRepositories(basePackages = {"zielinskin.generatorapp.data"})
public class Application implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/api", "/swagger-ui.html");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public GroupedOpenApi foobarDocket() {
        return GroupedOpenApi.builder()
                .group("FooBar")
                .pathsToMatch("/foobars/**")
                .build();
    }

    @Bean
    public GroupedOpenApi fooDocket() {
        return GroupedOpenApi.builder()
                .group("Foo")
                .pathsToMatch("/foos/**")
                .build();
    }
}
