package at.refugeecode.hospital.model;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class Strter {

    @Autowired
    RestTemplate restTemplate;
    @Bean
    ApplicationRunner applicationRunner(){
        return args -> {
            Paitent paitent1 = new Paitent();
            paitent1.setName("Mohamed");
            paitent1.setId("1");
            Set<String> symptomsSet1 = new HashSet<>();
            symptomsSet1.add("temperature");
            symptomsSet1.add("diarrhoea");
            paitent1.setSymptoms(symptomsSet1);

            Paitent paitent2 = new Paitent();
            paitent2.setName("Sami");
            paitent2.setId("2");
            Set<String> symptomsSet2 = new HashSet<>();
            symptomsSet2.add("colic");
            symptomsSet2.add("temperature");
            paitent2.setSymptoms(symptomsSet2);

            Paitent paitent3 = new Paitent();
            paitent3.setName("Emad");
            paitent3.setId("3");
            Set<String> symptomsSet3 = new HashSet<>();
            symptomsSet3.add("colic gonorrhea");
            paitent3.setSymptoms(symptomsSet3);

            restTemplate.postForEntity("http://localhost:8083/paitent", paitent1, Paitent.class);
            restTemplate.postForEntity("http://localhost:8083/paitent", paitent2, Paitent.class);
            restTemplate.postForEntity("http://localhost:8083/paitent", paitent3, Paitent.class);


        };
    }
}
