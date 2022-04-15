package JavaProjects.P03_UcusProjesi.UcusProje;

public class Passenger {
    private int flyTo;
    private int age;
    private int flyType;

    // parametresiz contructor
    public Passenger() {
    }

    // parametreli constructor
    public Passenger(int flyTo, int age, int flyType) {
        this.flyTo = flyTo;
        this.age = age;
        this.flyType = flyType;
    }

    // getter & setter  methods


    public int getFlyTo() {
        return flyTo;
    }

    public void setFlyTo(int flyTo) {
        this.flyTo = flyTo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFlyType() {
        return flyType;
    }

    public void setFlyType(int flyType) {
        this.flyType = flyType;
    }
}
