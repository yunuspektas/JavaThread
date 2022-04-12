package JavaProjects.P03_UcusProjesi.Ucus_projesi01;

import java.util.Scanner;

public class TMM_Menu {
    static Scanner scan = new Scanner(System.in);
    public static void menu() {

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
        System.out.println("Yolculuğunuz gidiş-dönüş mü olsun \n1-Evet \n2-Hayır");
        int flyType = scan.nextInt();

        // kullanıcıdan alınan bilgiler ile Passenger constructor çağırılıyor
        TMM_Passenger passenger1 = new TMM_Passenger(flyTo, age, flyType);

        // bilet fiyatı hesaplansın diye ilgili sınıfdaki metod  çağırılıyor
        TMM_CalculateTicket.calculateTicketPrice(passenger1);
    }


}



