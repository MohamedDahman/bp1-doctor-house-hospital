package at.refugeecode.diagnose.Initializer;

import at.refugeecode.diagnose.model.Check;
import at.refugeecode.diagnose.model.Diseases;
import at.refugeecode.diagnose.model.Paitent;
import at.refugeecode.diagnose.model.Symptoms;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Stream;

@Configuration
public class Starter {

  /*  @Value("${Diseaseslist}")
    private String diseaseslist;
*/
    public Check check;

    @Bean
    ApplicationRunner applicationRunner(Check check){
        return args -> {
/*

            String fever = "fever";
            Symptoms temperature = new Symptoms("temperature");
            Symptoms diarrhoea = new Symptoms("diarrhoea");
            Set<Symptoms> symptomsList = new HashSet<>();
            symptomsList.add(temperature);
            symptomsList.add(diarrhoea);
            check.addcheck(fever,symptomsList);

            Diseases cough = new Diseases("cough");
            Symptoms colic = new Symptoms();
            Set<Symptoms> symptomsList1 = new HashSet<>();
            symptomsList1.add(colic);
            symptomsList1.add(temperature);
            check.addcheck(symptomsList1,cough);

            Diseases cold =new Diseases("cold");
            Set<Symptoms> symptomsList2 = new HashSet<>();
            symptomsList2.add(new Symptoms("gonorrhea"));
            check.addcheck(symptomsList2,cold);

            System.out.println(check.getDiseasesListHashMap());
*/

        };
    }

    private void getBuild(String[] e,Check check) {
/*
        Diseases diseases = new Diseases();
        diseases.setName(e[0]);
        System.out.println(e[0]);

        System.out.println(e[1]);
        Set<Symptoms> symptomsList=new HashSet<>();
        for (String symptomvalue :e[1].split(",")) {
            Symptoms symptom = new Symptoms();
            symptom.setName(symptomvalue);
            symptomsList.add(symptom);
        }
        check.addcheck(symptomsList,diseases);
*/
    }
}
