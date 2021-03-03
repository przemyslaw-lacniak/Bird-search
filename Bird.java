
public class Bird {

    private String name;
    private String nameInLatin;
    private int observations;

    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observations = 0;
    }

    public void Observation() {
        this.observations++;
    }

    public int getObservations() {
        return observations;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.nameInLatin + "): " + this.observations + " observations";
    }

}
