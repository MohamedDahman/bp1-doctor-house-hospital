package at.refugeecode.diagnose.Control;

import at.refugeecode.diagnose.model.Check;
import at.refugeecode.diagnose.model.Diseases;
import at.refugeecode.diagnose.model.Paitent;
import org.springframework.stereotype.Component;

@Component
public class DoctorHouse {

    private Check check;

    public DoctorHouse(Check check) {

        this.check = check;
    }

    public Paitent diagnose(Paitent paitent,Check check) {
        String diseases = check.getCheck(paitent.getSymptoms());
        paitent.setIllness(diseases);
        return  paitent;
    }

}
