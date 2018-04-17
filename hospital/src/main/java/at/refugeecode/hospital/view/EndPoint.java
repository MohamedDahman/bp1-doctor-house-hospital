package at.refugeecode.hospital.view;

import at.refugeecode.hospital.model.Paitent;
import at.refugeecode.hospital.model.Symptoms;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
public class EndPoint {


    private RestTemplate restTemplate;


    private List<Paitent> paitentList=new ArrayList<>();
    private List<Paitent> paitentListforDiagnose = new ArrayList<>();

    public EndPoint(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/paitent")
    List<Paitent> getAllPaitent(){
        return paitentList;
    }


    @PostMapping("/paitent")
    void addPaitent(@RequestBody Paitent paitent){
        paitentList.add(paitent);
        paitentListforDiagnose.add(paitent);
    }

    @GetMapping("/diagnose")
    void sendPaitent(){
        for (Paitent p:paitentListforDiagnose) {
            restTemplate.postForEntity("http://localhost:8081/diagnose", p, Paitent.class);
        }
        paitentListforDiagnose.clear();
    }

}
