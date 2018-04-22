package at.refugeecode.diagnose.model;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfiguration {
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}