package info.novatec.person.boundary;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages={"info.novatec.person"})
@EnableAutoConfiguration
@EnableJpaRepositories("info.novatec.person")
@EntityScan(basePackages={"info.novatec.person"})
@WebIntegrationTest
public class PersonServiceIntegrationTestConfiguration {

}
