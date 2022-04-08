package projects.P03_UcusProjesi.Ucus_projesi01;

public class Mrc_Passenger {
    private int flyTo ;
    private int age ;
    private String flyType ;

    // parametresiz contructor
    public Mrc_Passenger() {
    }

    // parametreli constructor
    public Mrc_Passenger(int flyTo, int age, String flyType) {
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

    public String getFlyType() {
        return flyType;
    }

    public void setFlyType(String flyType) {
        this.flyType = flyType;
    }
}
