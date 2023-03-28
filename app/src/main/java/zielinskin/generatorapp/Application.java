package zielinskin.generatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import zielinskin.foobar.FooBarConfiguration;

@SpringBootApplication
@Import(FooBarConfiguration.class)
public class Application implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/api", "/swagger-ui.html");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
