package JavaProjects.P03_UcusProjesi.UcusProje;

public class Ticket {
    public static void calculateTicketPrice(Passenger passenger1) { // parametre
        double price = 0.0;
        double pricePerKm = 0.1;

        // uçuş rotası sorgusu **** ( flyTo ) ****
        if (passenger1.getFlyTo() == 1) price = pricePerKm * 500; // istanbul
        else if (passenger1.getFlyTo() == 2) price = pricePerKm * 700; // Ankara
        else if (passenger1.getFlyTo() == 3) price = pricePerKm * 900; // Urfa

        // yaş sorgusu **** ( age ) ****
        if (passenger1.getAge() < 12) price *= 0.5;
        else if (passenger1.getAge() >= 12 && passenger1.getAge() <= 24) price *= 0.9;
        else if (passenger1.getAge() > 65) price *= 0.7;

        //uçuş tipi sorgusu **** ( flyType ) ****
        if (passenger1.getFlyType()==1) price = price*2*0.8;

        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("\tBilet Ücretiniz : " + price +"$");
        System.out.println("\tİyi Yolculuklar Dileriz ");
        System.out.println("-------------------------------");
    }

}
