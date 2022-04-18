package JavaProjects.P05_HalukMarket.HalukMarket03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import static JavaProjects.P05_HalukMarket.HalukMarket03.Items.items;

public class MarketOperations {
    static Scanner scan = new Scanner(System.in);
    static double totalPrice = 0.0;
    static List<String> Sepet = new ArrayList<>();

    static public void listItems() {
        Items item = new Items();
        System.out.println("\t\t************** ÜRÜN LİSTESİ *************");
        System.out.println("");
        System.out.println("\t\t\tNo\t\t\tÜrün\t\t\tFiyat");
        System.out.println("\t\t\t====\t\t=======\t\t\t======");
        for (Items each : items) {
            System.out.println("\t\t\t" + each.getItemNo()
                    + "\t\t\t" + each.getName() + "\t\t\t" + each.getPrice());
        }
        alisveris();
    }

    // ürün seçme metodu
    static public void alisveris() {

        System.out.print("Lütfen ürün nosuna göre listeden ürün seçiniz : ");
        int wantedItemNo = scan.nextInt();
        System.out.print("Lütfen üründen kaç km almak istediğinizi yazın  : ");
        double wantedKg = scan.nextDouble();
        double wantedItemPrice = findItemPrice(wantedItemNo);
        Sepet.add(AddSepetList(wantedItemNo, wantedKg));  // sepet listesi oluşturuldu.
        totalPrice += (wantedKg) * wantedItemPrice;
        System.out.println("Ürününüz sepetinize eklendi, başka bir ürün almak istiyor musunuz ? \n E- Evet \n H- Hayır ");
        String devam = scan.next().toUpperCase();
        //Evet Hayır için Tuş kontrolü yapıldı.
        while (!devam.equals("E") && !devam.equals("H")) {
            System.out.println(" Lütfen Evet için E harfini Hayır için H harfini tuşlayınız");
            System.out.println(" başka bir ürün almak istiyor musunuz ? \n E- Evet \n H- Hayır ");
            devam = scan.next().toUpperCase();
        }
        //Evet Hayır için Tuş kontrolü yapıldı.

        if (devam.equals("E")) alisveris();
        else if (devam.equals("H")) checkout();

    }

    // ekrana toplam borcu yazdıran metod
    private static void checkout() {

        System.out.println("\t\t************** SEPET LİSTESİ *************");
        for (String item : Sepet) {
            System.out.println(item);
        }
        System.out.println(" Alışveriş tutarınız : " + "\t\t\t\t\t\t\t\t\t" + totalPrice + " TL dir.");
    }

    // kullanıcının seçtiği ürünün fiyatını getiren metod
    private static double findItemPrice(int wantedItemNo) {
        double price = 0.0;
        for (Items each : items) {
            if (each.getItemNo() == wantedItemNo) {
                price = each.getPrice();
                break;
            }
        }
        return price;
    }

    private static String AddSepetList(int wantedItemNo, double kg) {
        String name = "";
        double price = 0.0;
        double total = 0.0;
        for (Items each : items) {
            if (each.getItemNo() == wantedItemNo) {
                price = each.getPrice();
                name = each.getName();
                break;
            }
        }
        total = price * kg;
        String liste = "\t\t\t" + wantedItemNo + "\t\t\t" + name + "\t\t\t" + price + "x" + kg + "\t\t\t" + String.format("%.2f", total);
        return liste;
    }
}