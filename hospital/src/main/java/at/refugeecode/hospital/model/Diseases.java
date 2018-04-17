package at.refugeecode.hospital.model;

public class Diseases {

    private String name;

    public Diseases(String name) {
        this.name = name;
    }

    public Diseases() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Diseases{" +
                "name='" + name + '\'' +
                '}';
    }
}
