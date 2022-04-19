package JavaProjects.P04_okulYönetimi.ogrcOgrtYonetimi;

public class Ogretmen extends Kisi {

    private String bolum;
    private String sicilNo;

    public Ogretmen() {

    }


    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {

        return "Ogrenci{" +
                " adSoyad='" + getAdSoyad() + '\'' +
                ", kimlikNo='" + getKimlikNo() + '\'' +
                ", yas=" + getYas() +
                ", bölüm='" + bolum + '\'' +
                ", Sicil No='" + sicilNo + '\'' +
                '}';
||||||| ce21405
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}';
=======
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                "} " + super.toString();
>>>>>>> f08342fb6e04d2bf143c3abfbb25d2b1b7e376a2
    }
// @Override
   // public String toString() {
   //     return "Ogretmen{" +
   //             "bolum='" + bolum + '\'' +
   //             ", sicilNo='" + sicilNo + '\'' +
   //             '}';
   // }
}


































