package JavaProjects.P11_depoYonetimi.Mrc;

import java.util.Arrays;
import java.util.Scanner;

import static JavaProjects.P11_depoYonetimi.Mrc.item.id;
import static JavaProjects.P11_depoYonetimi.Mrc.item.itemMap;

public class DepoMethods {
    static Scanner scan = new Scanner(System.in);

    public static void urunTanimlama() {

        System.out.print("Ürün ismini giriniz : ");
        String itemName = scan.next();

        System.out.print("Ürünün üreticisini giriniz : ");
        scan.nextLine();
        String itemOwner = scan.nextLine();

        System.out.print("Ürünün birimini giriniz : ");
        String birim = scan.next();

        itemMap.put(id, (itemName + " " + itemOwner + " " + "0" + " " + birim + " " + "0" + " " + "null"));
        id++;
        System.out.println("");
        System.out.println("*** Ürün tanımlama işlemi başarıyla gerçekleşti ***");
        Menu.menuGiris();
    }

    public static void urunListele() {
        int outherLoop = itemMap.keySet().size();
        //System.out.println("outher " + outherLoop);
        int innerLoop = itemMap.values().toArray()[0].toString().split(" ").length;
        //System.out.println(itemMap.values());
        //System.out.println("inner " + innerLoop);
        System.out.println("");
        String liste = String.format("%6S", "id") + "\t\t" + "ismi" + "\t\t" + "üretici" + "\t\t" + "miktarı" + "\t\t" + "birimi" + "\t\t" + "raf";
        System.out.println(liste);
        System.out.println("===================================================================");

        for (int i = 0; i < outherLoop; i++) {
            System.out.print("\t" + itemMap.keySet().toArray()[i]);
            for (int j = 0; j < innerLoop; j++) {
                System.out.printf("\t" + "%-11s", itemMap.values().toArray()[i].toString().split(" ")[j]);
            }
            System.out.println("");
        }
        Menu.menuGiris();
    }

    public static void urunGirisi() {
        System.out.print("Ürün id numarasını giriniz : ");
        int id = scan.nextInt();
        if(itemMap.containsKey(id)) {
            System.out.print("Miktarı giriniz : ");
            scan.nextLine();
            int urunMiktari = scan.nextInt();

            if (itemMap.containsKey(id)) {
                String[] arr = itemMap.get(id).split(" ");
                int miktar = (Integer.parseInt(arr[2])) + urunMiktari;

                itemMap.put(id, (arr[0] + " " + arr[1] + " " + miktar + " " + arr[3] + " " + arr[4]));
            }
            System.out.println("");
            System.out.println("*** Ürün girişi başarıyla gerçekleşmiştir. ***");
            Menu.menuGiris();
        } else  {
            System.out.println("");
            System.out.println("!!! Girilen id numarası hatalı , yeniden deneyiniz !!!");
            urunGirisi();
        }



    }

    public static void urunuRafaKoy() {

        System.out.print("Ürün id numarasını giriniz : ");
        int id = scan.nextInt();
        System.out.print("Rafı giriniz : ");
        scan.nextLine();
        String raf = scan.nextLine();

        if (itemMap.containsKey(id)) {
            String[] arr = itemMap.get(id).split(" ");


            itemMap.put(id, (arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + raf));
        }
        System.out.println("");
        System.out.println("*** Ürünü rafa koyma başarıyla gerçekleşmiştir. ***");
        Menu.menuGiris();


    }

    public static void urunCikisi() {

        System.out.print("Ürün id numarasını giriniz : ");
        int id = scan.nextInt();
        System.out.print("Çıkmak istediğiniz miktarı giriniz : ");
        scan.nextLine();
        int urunCikisMiktari = scan.nextInt();
        String[] arr = itemMap.get(id).split(" ");
        int miktar = 0;
        if (Integer.parseInt(arr[2])>urunCikisMiktari) {
            if (itemMap.containsKey(id)) {

                miktar = (Integer.parseInt(arr[2])) - urunCikisMiktari;

                itemMap.put(id, (arr[0] + " " + arr[1] + " " + miktar + " " + arr[3] + " " + arr[4]));
            }
            System.out.println("");
            System.out.println("*** Ürün çıkışı başarıyla gerçekleşmiştir *** ");
            System.out.println( "ürün çıkış : " + urunCikisMiktari + " adet , kalan : " + miktar + " " + arr[3] + " " + arr[0]);
        } else System.out.println("!!! Yeterli miktarda çıkış yapacak ürün yok malesef !!! ");
        Menu.menuGiris();

    }


}


