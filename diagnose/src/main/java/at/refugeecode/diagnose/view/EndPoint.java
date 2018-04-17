package at.refugeecode.diagnose.view;

import at.refugeecode.diagnose.Control.DoctorHouse;
import at.refugeecode.diagnose.model.Check;
import at.refugeecode.diagnose.model.Diseases;
import at.refugeecode.diagnose.model.Paitent;
import at.refugeecode.diagnose.model.Symptoms;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class EndPoint {

    List<Paitent> paitentList = new ArrayList<>();
    List<Diseases> diseasesList = new ArrayList<>();
    List<Symptoms> symptomsList = new ArrayList<>();

    @PostMapping("/diagnose")
    void setPaiten(@RequestBody Paitent paitent){
        paitentList.add(paitent);
    }


    @GetMapping("/diagnose")
    List<Paitent> setPaiten(){
        return paitentList;
    }

    @PostMapping("/diseases")
    void setdiseases(@RequestBody Diseases diseases){
        diseasesList.add(diseases);
    }

    @GetMapping("/diseases")
    List<Diseases> getDiseasesList(){
        return diseasesList;
    }

    @PostMapping("/SymptomsList")
    void setSymptoms(@RequestBody  Symptoms symptoms){
        symptomsList.add(symptoms);
    }


    @GetMapping("/Symptoms")
    List<Symptoms> getSymptomsList(){
        return symptomsList;
    }


    @PostMapping("/setsyptoms/{id}")
    Paitent setSyptomsToPaitent(@PathVariable String id,@RequestBody String symptom) {
        Optional<Paitent> first = paitentList.stream()
                                             .filter(e -> e.getId()
                                             .equals(id))
                                             .findFirst();
        if (first.isPresent()) {
            Set<String> symptomsList1=new HashSet<String>();
            if (first.get().getSymptoms().isEmpty()){
                symptomsList1.add(symptom);
            }
            else
            {
                symptomsList1.addAll(first.get().getSymptoms());
                symptomsList1.add(symptom);
            }
            first.get().setSymptoms(symptomsList1);
            return first.get();
        }
        else
        {
           return new Paitent("No one like this no");
        }

    }


    @GetMapping("/doctorhouse/{id}")
    Paitent getresult(@PathVariable String id, DoctorHouse doctorHouse,Check check){

        Optional<Paitent> first = paitentList.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
        if (first.isPresent()) {
            doctorHouse.diagnose(first.get(),check);
            return first.get();
        }
        else
        {
            return new Paitent("No one like this no");
        }

    }

}
