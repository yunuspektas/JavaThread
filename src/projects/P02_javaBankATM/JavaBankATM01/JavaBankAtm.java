package projects.P02_javaBankATM.JavaBankATM01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class JavaBankAtm {
   /*      ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,       */


    static Scanner scan = new Scanner(System.in);
    static public Customer secilen ;
    static ArrayList<Customer> cst = new ArrayList<>(); // ilk iki customer otomatik oluşturulup List e eklenecek

    public static void main(String[] args) {

        System.out.println("********* Welcome to Bank Of Java *********");
        addFirstCustomer();  // ilk iki customer oluşturan metod çağırılıyor
        isValidCostomer ();  // kullanıcıdan girilen bilgiler check ediliyor. doğruysa seçim ekranına geçiren metod çağırılıyor

    }

    // uygulama başında 2 customer oluşturulup List e ekleyen metod
    public static void addFirstCustomer() {
        //ArrayList<Customer> cst = new ArrayList<> ();
        cst.add(0, new Customer("123456", "123456", 500));
        cst.add(1, new Customer("012345", "012345", 1000));
    }

    // kullanıcıdan girilen değerler kontrol eden metod
    public static void isValidCostomer (){
            System.out.print("Lütfen Kart Numaranızı giriniz : ");
            String eCardNumber = scan.next();
            System.out.print("Lütfen Kart Şifrenizi giriniz : ");
            String eCardPass = scan.next();
            // if bloğu ile kullanıcının girildiği bilgiler List de var mı kontrol ediliyor
            if ((cst.get(0).getCardNumber().equals(eCardNumber) && cst.get(0).getCardPassword().equals(eCardPass))
                    || (cst.get(1).getCardNumber().equals(eCardNumber) && cst.get(1).getCardPassword().equals(eCardPass))) {
                secilen =  BankOperations.findCustomer(eCardNumber);
                ScreenMenu.menu();



            } else {
                System.out.println("Girdiğiniz bilgiler hatalı, lütfen yeniden deneyiniz..");
                isValidCostomer(); // recursive
            }
        }



}


