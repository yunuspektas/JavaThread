package JavaProjects.P03_UcusProjesi.UcusProje;

import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);

    public static void menu() {

        // kullanıcıdan yolcu ile ilgili gerekli bilgiler alınacak

        //uçulacak şehir seçimi
        System.out.println("Uçuş yapmak istediğiniz Şehiri seçiniz " +
                "\n1- Istanbul \n2- Ankara \n3- Urfa ");
        int flyTo = scan.nextInt();
        if (flyTo < 1 || flyTo > 3) {
            System.out.println("Şehir bilgisini yanlış girdiniz ");
            menu();
        }


        //yaş bilgisi alınıyor
        System.out.print("Lütfen yaşınızı giriniz : ");
        int age = scan.nextInt();

        //yolculuğun gidiş dönüş olmadığı bilgisi alınıyor
        System.out.println("Yolculuğunuz gidiş-dönüş mü olsun \n1-Evet \n2-Hayır");
        int flyType = scan.nextInt();

        // kullanıcıdan alınan bilgiler ile Passenger constructor çağırılıyor
        Passenger passenger1 = new Passenger(flyTo, age, flyType); // Argüman

        // bilet fiyatı hesaplansın diye ilgili sınıfdaki metod  çağırılıyor
        Ticket.calculateTicketPrice(passenger1); // Argüman
    }


}



