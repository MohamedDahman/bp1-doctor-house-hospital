package at.refugeecode.nursery.View;

import at.refugeecode.nursery.model.Paitent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EndPoint {

    private List<Paitent> paitentList=new ArrayList<>();

    @PostMapping("/patients")
    void receivePatients(@RequestBody Paitent paitent){
            paitentList.add(paitent);
    }

    @GetMapping("/patients")
    List<Paitent> showPatients(){
        return paitentList;
    }

}
