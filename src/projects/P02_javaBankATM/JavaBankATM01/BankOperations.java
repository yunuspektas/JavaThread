package projects.P02_javaBankATM.JavaBankATM01;

import java.util.Scanner;

public class BankOperations {
    static Scanner scan = new Scanner(System.in);
    static Customer secilen;


    public static void bakiyeSor(Customer customer) {
        System.out.println("Bakiyeniz : " + customer.getAccountBalance());
        ScreenMenu.menu();
    }

    public static void paraYatir(Customer customer) {
        System.out.print("Yatırmak istediğiniz miktarı giriniz : ");

        customer.setAccountBalance((customer.getAccountBalance() + scan.nextDouble()));
        System.out.println("Para yatırma işleminiz başarı ile gerçekleşmiştir");
        ScreenMenu.menu();
    }

    public static void paraCek(Customer customer) {
        System.out.print("Çekmek istediğiniz miktarı giriniz : ");
        double amount =  scan.nextDouble();
        if (customer.getAccountBalance() >=amount) {
            customer.setAccountBalance((customer.getAccountBalance() - amount));
            System.out.println("Para çekme işleminiz başarı ile gerçekleşmiştir");

        } else {
            System.out.println("Hesabınızda yeterli bakiye yok ");

        }
        ScreenMenu.menu();
    }

    public static void paraGonder(Customer gonderici) {
        System.out.print("Lütfen göndermek istediğiniz kişin kart numarasını giriniz : ");
        Customer alici=findCustomer(scan.next());
        System.out.print("Göndermek istediğiniz miktarı giriniz : ");
        double amount = scan.nextDouble();
        if(gonderici.getAccountBalance()>=amount) {
            alici.setAccountBalance(secilen.getAccountBalance()+amount);
            gonderici.setAccountBalance(gonderici.getAccountBalance()-amount);
            System.out.println("Gönderme işleminiz gerçekleşmiştir");
        } else System.out.println("Hata : bakiyeniz yeterli değildir..");
        ScreenMenu.menu();
    }

    public static void changePassword(Customer customer) {
        System.out.print("Lütfen yeni şifrenizi giriniz : ");
        String newPass = scan.next();
        customer.setCardPassword(newPass);
        System.out.println("Şifre değiştirme işleminiz başarı ile gerçekleşmiştir");
        ScreenMenu.menu();
    }

    public static Customer findCustomer(String customerCardNumber) {

        if (JavaBankAtm.cst.get(0).getCardNumber().equals(customerCardNumber)) secilen = JavaBankAtm.cst.get(0);
        else if (JavaBankAtm.cst.get(1).getCardNumber().equals(customerCardNumber)) secilen = JavaBankAtm.cst.get(1);
        else {
            System.out.println("Girilen Kart numarası geçerli değildir");
            ScreenMenu.menu();

        }
        return secilen;
    }


}
