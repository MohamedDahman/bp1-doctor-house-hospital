package at.refugeecode.nursery.control;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class Treatment {

    private HashMap<String,Set<String>> treatmentHashMap = new HashMap<>();


    public Treatment() {

        String fever = "fever";
        String feverTreatment = "Cetamol";
        Set<String> collectfever = Arrays.stream(feverTreatment.split(", ")).collect(Collectors.toSet());
        treatmentHashMap.put(fever,collectfever);


        String cough = "cough";
        String coughTreatment = "Areus, Cetamol";
        Set<String> collectcough = Arrays.stream(coughTreatment.split(", ")).collect(Collectors.toSet());
        treatmentHashMap.put(cough,collectcough);


        String cold = "cold";
        String coldTreatment = "cream";
        Set<String> collectSyptoms = Arrays.stream(coughTreatment.split(",")).collect(Collectors.toSet());
        treatmentHashMap.put(cold, collectSyptoms);

    }



}
