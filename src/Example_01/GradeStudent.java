package Example_01;

import java.util.Scanner;

public class GradeStudent {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double avarage;
        System.out.println("Vize notunuzu giriniz");
        int a = scan.nextInt();
        System.out.println("Final notunuzu Giriniz");
        int x = scan.nextInt();
        try {
            avarage = checkVize(a) + checkFinal(x);
            System.out.println(avarage);
            System.out.println("Avarage is: " + avarage + " " + "Mezuniyet durumu: " + isGrade(avarage));
        } catch (IllegalValuesExceptions e) {
            System.out.println(e.getMessage());
        }

    }

    private static boolean isGrade(double avarage) {
        if (avarage > 69) {
            return true;
        } else {
            return false;
        }

    }

    private static double checkFinal(int x) throws IllegalValuesExceptions {
        double f;
        if (x < 0 || x > 100) {
            throw new IllegalValuesExceptions("Cok zor degil; Final icin 0-100 arasi deger girin dedik. Simdi seni nasil mezun edelim vitaminsiz");
        } else {
            f = x * (0.6);
            System.out.println("final notu: " + f);
        }
        return f;
    }


    private static double checkVize(int a) throws IllegalValuesExceptions { //  ! 47.satırın çalışması için throws eklendi.
        double v;
        if (a < 0 || a > 100) {
            throw new IllegalValuesExceptions("Cok zor degil; Vize icin 0-100 arasi deger girin dedik. Simdi seni nasil mezun edelim ebleh");
        } else {
            v = a * (0.4);
            System.out.println("vize notu: " + v);
        }
        return v;


    }
}






