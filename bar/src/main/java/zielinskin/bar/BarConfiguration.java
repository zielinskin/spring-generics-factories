package zielinskin.bar;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("zielinskin.bar")
@EntityScan(basePackages = {"zielinskin.bar"})
@EnableJpaRepositories(basePackages = {"zielinskin.bar"})
public class BarConfiguration {
}
