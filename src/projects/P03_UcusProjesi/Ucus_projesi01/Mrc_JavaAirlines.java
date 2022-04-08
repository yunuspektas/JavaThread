package projects.P03_UcusProjesi.Ucus_projesi01;

import java.util.Scanner;

public class Mrc_JavaAirlines {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // kullanıcıdan yolcu ile ilgili gerekli bilgiler alınacak
        System.out.println("***** ***** ***** Welcome to JavaAirlines ***** ***** *****");
        System.out.println("");
        //uçulacak şehir seçimi
        System.out.println("Uçuş yapmak istediğiniz Şehiri seçiniz " +
                "\n1- B Şehri \n2- C Şehri \n3- D Şehri ");
        int flyTo = scan.nextInt();
        //yaş bilgisi alınıyor
        System.out.print("Lütfen yaşınızı giriniz : ");
        int age = scan.nextInt();
        //yolculuğun gidiş dönüş olmadığı bilgisi alınıyor
        System.out.println("Yolculuğunuz gidiş-dönüş mü olsun \nEvet \nHayır");
        String flyType = scan.next();

        // kullanıcıdan alınan bilgiler ile Passenger constructor çağırılıyor
        Mrc_Passenger passenger1 = new Mrc_Passenger(flyTo, age, flyType);
        // bilet fiyatı hesaplansın diye metod çağırılıyor
        calculateTicketPrice(passenger1);
    }

    private static void calculateTicketPrice(Mrc_Passenger passenger1) {
        double price = 0.0;
        double pricePerKm = 0.1;

        // uçuş rotası sorgusu
        if (passenger1.getFlyTo() == 1) price = pricePerKm * 500;
        else if (passenger1.getFlyTo() == 2) price = pricePerKm * 700;
        else if (passenger1.getFlyTo() == 3) price = pricePerKm * 900;
        // yaş sorgusu
        if (passenger1.getAge() < 12) price *= 0.5;
        else if (passenger1.getAge() >= 12 || passenger1.getAge() <= 24) price *= 0.9;
        else if (passenger1.getAge() > 65) price *= 0.7;
        //uçuş tipi sorgusu
        if (passenger1.getFlyType().equals("Evet")) price *= 0.8;

        System.out.println("Bilet ücretiniz : " + price);
    }
}
