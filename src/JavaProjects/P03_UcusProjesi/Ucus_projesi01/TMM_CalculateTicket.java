package JavaProjects.P03_UcusProjesi.Ucus_projesi01;

public class TMM_CalculateTicket {
    public static void calculateTicketPrice(TMM_Passenger passenger1) {
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
        if (passenger1.getFlyType()==1) price *= 0.8;

        System.out.println("Bilet ücretiniz : " + price +"$");
    }

}
