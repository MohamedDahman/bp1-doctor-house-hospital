package at.refugeecode.diagnose.model;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Component
public class  Check {
    private HashMap<String,Set<String>> diseasesListHashMap = new HashMap<>();

    public Check() {


        String fever = "fever";
        String feverSyptoms = "temperature, diarrhoea";
        Set<String> collectfever = Arrays.stream(feverSyptoms.split(", ")).collect(Collectors.toSet());

        diseasesListHashMap.put(fever,collectfever);


        String cough = "cough";
        String coughSyptoms = "temperature, colic";
        Set<String> collectcough = Arrays.stream(coughSyptoms.split(", ")).collect(Collectors.toSet());
        diseasesListHashMap.put(cough,collectcough);


        String cold = "cold";
        String coldSyptoms = "gonorrhea";
        Set<String> collectSyptoms = Arrays.stream(coldSyptoms.split(",")).collect(Collectors.toSet());
        diseasesListHashMap.put(cold, collectSyptoms);

    }


    public HashMap<String ,Set<String>> getDiseasesListHashMap() {
        return diseasesListHashMap;
    }


    public void addcheck(String diseases,Set<String> syptoms){
            diseasesListHashMap.put(diseases,syptoms);
    }


    public String getCheck(Set<String> symptomsList){

        System.out.println( diseasesListHashMap.toString());
        System.out.println(symptomsList.toString());
        Optional<Map.Entry<String, Set<String>>> first = diseasesListHashMap.entrySet().stream().filter(e -> e.getValue().containsAll(symptomsList)).findFirst();


        if (first.isPresent()){
            return first.get().getKey();
        }
            return  "LOPOS";


    }


}