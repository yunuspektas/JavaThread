package generics.myListClassProject;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizinin Kapasitesi :" + liste.getCapacity());
        System.out.println("Dizideki Eleman Sayısı :" + liste.size());
        System.out.println(liste);
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizinin Kapasitesi :" + liste.getCapacity());
        System.out.println("Dizideki Eleman Sayısı :" + liste.size());
        System.out.println(liste);
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        System.out.println("Dizinin Kapasitesi :" + liste.getCapacity());
        System.out.println("Dizideki Eleman Sayısı :" + liste.size());
        System.out.println(liste);
        System.out.println("***********************************************************");
        MyList<Integer> liste1 = new MyList<>();
        liste1.add(10);
        liste1.add(20);
        liste1.add(30);
        System.out.println("2. indisteki değer: " + liste1.get(2));
        liste1.remove(2);
        liste1.add(40);
        liste1.set(0, 100);
        System.out.println("2. indisteki değer :" + liste1.get(2));
        System.out.println(liste1);
        System.out.println("***********************************************************");
        MyList<Integer> liste5 = new MyList<>();
        System.out.println("Liste Durumu : " + (liste5.isEmpty() ? "Boş" : "Dolu"));
        liste5.add(10);
        liste5.add(20);
        liste5.add(30);
        liste5.add(40);
        liste5.add(20);
        liste5.add(50);
        liste5.add(60);
        liste5.add(70);
        System.out.println("Liste Durumu : " + (liste5.isEmpty() ? "Boş" : "Dolu"));
        //Bulduğu ilk indeksi verir:
        System.out.println("Indeks :" + liste5.indexOf(20));
        // Bulamazsa -1 döndürür:
        System.out.println("Indeks :" + liste5.indexOf(100));
        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste5.lastIndexOf(20));
        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = liste5.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);
        // Liste veri türünde alt bir liste oluşturdu
        MyList<Integer> altListem = liste5.subList(0, 3);
        System.out.println(altListem.toString());
        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste5.contains(20));
        System.out.println("Listemde 120 değeri : " + liste5.contains(120));
        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste5.clear();
        System.out.println(liste5);
    }
}
