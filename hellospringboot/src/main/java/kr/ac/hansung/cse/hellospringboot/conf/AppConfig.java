package kr.ac.hansung.cse.hellospringboot.conf;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration  // @Component
@ConfigurationProperties(prefix = "app")
public class AppConfig {
    @Value("${app.professor}")
    private String professor;
    @Value("${app.course}")
    private String course;
}
