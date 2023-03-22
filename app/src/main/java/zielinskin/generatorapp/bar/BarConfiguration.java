package zielinskin.generatorapp.bar;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@Configuration
@Component("zielinskin.generatorapp.bar")
@EntityScan(basePackages = {"zielinskin.generatorapp.bar"})
@EnableJpaRepositories(basePackages = {"zielinskin.generatorapp.bar"})
class BarConfiguration {
}
