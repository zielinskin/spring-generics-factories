package zielinskin.generatorapp.bar;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("zielinskin.generatorapp.bar")
@EntityScan(basePackages = {"zielinskin.generatorapp.bar"})
@EnableJpaRepositories(basePackages = {"zielinskin.generatorapp.bar"})
class BarConfiguration {
}
