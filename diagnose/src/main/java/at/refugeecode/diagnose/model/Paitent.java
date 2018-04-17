package at.refugeecode.diagnose.model;


import java.util.HashSet;
import java.util.Set;

public class Paitent {

    private String id;
    private String name;
    private Set<String> symptoms;// TODO: 3/29/2018  change list of String to List of Object
    private String illness;

    public Paitent() {
        Set<String> symptomsSet= new HashSet<String>();
        symptoms = symptomsSet;
    }

    public Paitent(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(Set<String> symptoms) {
        this.symptoms = symptoms;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
