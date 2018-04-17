package at.refugeecode.hospital.model;


import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class Paitent {

    @NotNull
    private String id;
    private String name;
    private Set<String> symptoms;// TODO: 3/29/2018  change list of String to List of Object
    private String illness; // TODO: 3/29/2018   change list of string to List of Object


    public Paitent() {
        Set<String> sympt= new HashSet<String>();
        symptoms = sympt;
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

    public String getIllness()
    {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
