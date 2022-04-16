package JavaProjects.P05_HalukMarket.HalukMarket03;

import java.util.Scanner;

import static JavaProjects.P05_HalukMarket.HalukMarket03.Items.items;

public class MarketOperations {
    static Scanner scan = new Scanner(System.in);
    static double totalPrice = 0.0;

    static public void listItems(){
        Items item = new Items();
        System.out.println("\t\t************** ÜRÜN LİSTESİ *************");
        System.out.println("");
        System.out.println("\t\t\tNo\t\t\tÜrün\t\t\tFiyat");
        System.out.println("\t\t\t====\t\t=======\t\t\t======");
        for (Items each: items ) {
            System.out.println("\t\t\t" + each.getItemNo()
                    + "\t\t\t" + each.getName() + "\t\t\t" + each.getPrice() );
        }
        alisveris();
    }
    // ürün seçme metodu
    static public void alisveris(){
        System.out.print("Lütfen ürün nosuna göre listeden ürün seçiniz : ");
        int wantedItemNo = scan.nextInt();
        System.out.print("Lütfen üründen kaç km almak istediğinizi yazın  : ");
        double wantedKg = scan.nextDouble();
        double wantedItemPrice = findItemPrice(wantedItemNo);
        totalPrice += (wantedKg)* wantedItemPrice;
        System.out.println("Ürününüz sepetinize eklendi, başka bir ürün almak istiyor musunuz ? \n E- Evet \n H- Hayır " );
        String devam = scan.next().toUpperCase();
        if(devam.equals("E")) alisveris();
        else if (devam.equals("H")) checkout();

    }
    // ekrana toplam borcu yazdıran metod
    private static void checkout() {
        System.out.println(" Alışveriş tutarınız : " + totalPrice + " TL dir.");
    }

    // kullanıcının seçtiği ürünün fiyatını getiren metod
    private static double findItemPrice(int wantedItemNo) {
        double price = 0.0;
        for (Items each:items) {
            if(each.getItemNo()==wantedItemNo) {
                price = each.getPrice();
                break;
            }
        }
        return price;
    }
}


