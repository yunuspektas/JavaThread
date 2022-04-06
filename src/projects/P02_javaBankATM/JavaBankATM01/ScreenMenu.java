package projects.P02_javaBankATM.JavaBankATM01;

import java.util.Scanner;

public class ScreenMenu {

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi seçiniz " +
                "\n1-Bakiye Sorgulama " +
                "\n2-Para Yatırma " +
                "\n3-Para Çekme " +
                "\n4-Para Gönderme" +
                "\n5-Şifre Değiştirme" +
                "\n6-Çıkış");
        int choise = scan.nextInt();

        switch(choise) {
            case 1:
                BankOperations.bakiyeSor(JavaBankAtm.secilen);
                break ;
            case 2:
                BankOperations.paraYatir(JavaBankAtm.secilen);
                break;
            case 3:
                BankOperations.paraCek(JavaBankAtm.secilen);
                break;
            case 4:
                BankOperations.paraGonder(JavaBankAtm.secilen);
                break;
            case 5 :
                BankOperations.changePassword(JavaBankAtm.secilen);
                break;
            case 6 :
                break;
        }



    }
}
