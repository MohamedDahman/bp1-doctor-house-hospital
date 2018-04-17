package at.refugeecode.diagnose.model;

public class Symptoms {
    private String name;

    public Symptoms(String name) {
        this.name = name;
    }

    public Symptoms() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Symptoms{" +
                "name='" + name + '\'' +
                '}';
    }
}
