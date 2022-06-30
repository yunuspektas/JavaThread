package multiThreading;

/*
============================================= VOLATILE ===============================================================
Volatile (uçucu, geçici, kalıcı olmayan) keyword'u, Bir degiskenin farklı threadler tarafından kullanılırken degerinin
degismesini saglamak icin kullanılmaktadir. Aynı zamanda bir class'ı thread-safe(thread güvenliği ile çalışma) yapmak
icin de kullanılır.  Yani eş zamanlı olarak volatile veriable threadler tarafından erişip güncelleyebilir ve Volatile
 keywordu sadece degiskenler ile (primitif veya non-primitif)  kullanılabilir. Obj, method ve Class'lara konulmaz

Volatile keywordu kullanılan bir veriable'ın degeri cache bellege saklanmaz. Her defasında ilgili class'ın process bellegi
(MAIN MEMORY) den okunur. Dolayısıyla farklı thread'ler degiskeni guncellese de her defasında en guncel deger okunmus olur.
Bu özellikleri sayesinde Synchronization yönteminin daha iyi bir alternatifi olarak düşünülebilir.
*/
public class MT05Volatile {
   volatile public static int yas = 0;//class level'de birden çok thraed'in eş zamanlı update edeceği veriable create edildi.(şut çekilecek top)

    public static void main(String[] args) {
        Thread thMessi = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {//sonsuz loop
                    if (yas == 0) {//yas veriable 0 old surece print run et degise loop break
                        System.out.println("Messi şutu çekti -> yas hala 0 buyumedi bu veled");
                    } else break;
                }
            }
        });
        Thread thRonaldo = new Thread(new Runnable() {

            @Override
            public void run() {
               try {
                   Thread.sleep(5000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
                yas = 1;
                System.out.println("Ronaldo şutu çekti -> veled nihayet yasına bastı");
            }
        });
        thMessi.start();thRonaldo.start();
    }
}


