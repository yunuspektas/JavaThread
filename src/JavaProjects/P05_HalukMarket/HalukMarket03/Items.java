package JavaProjects.P05_HalukMarket.HalukMarket03;

import java.util.ArrayList;

public class Items {
    private String name ;
    private double price;
    private int itemNo ;
    private static int dynamicItemNo = 0;
    static ArrayList<Items> items = new ArrayList<>();
    public Items() { // ürünler ekleniyor
        Items domates = new Items("Domates", 2.10, 0);
        Items patates = new Items("Patates", 3.20, 1);
        Items biber = new Items("Biber", 1.50, 2);
        Items sogan = new Items("Soğan", 2.30, 3);
        Items havuc = new Items("Havuç", 3.10, 4);
        Items elma = new Items("Elma", 1.20, 5);
        items.add(domates);
        items.add(patates);
        items.add(biber);
        items.add(sogan);
        items.add(havuc);
        items.add(elma);
    }
    //parametreli constructor
    public Items(String name, double price, int itemNo) {
        this.name = name;
        this.price = price;
        this.itemNo = dynamicItemNo;
        dynamicItemNo++;

    }

    // listeye ürün ekleme
    public void addItem(Items item) {
        items.add(item);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }
}
