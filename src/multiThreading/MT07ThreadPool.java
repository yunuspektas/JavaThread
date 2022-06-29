package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

/* =============================================== THREAD POOL ====================================================
   Thread Pool, ExecutorService interface'i yardımıyla oluşturulan bir Thread havuzudur. Hizmet görecek olan
   thread'ler baştan bir kere oluşturulur sonrasında ise kuyrukta (TaskQueue) sıranın ona gelmesine bekler.
   Havuzun kapasitesi ölçüsünde thread'ler eş zamanlı hizmet görürler.

    Bu yöntem baştan thread'lerin oluşturulmasını, belirli sayıda thread'in eş-zamanlı çalıştırılmasını ve
    gerektiğinde tekrar kullanılmasını sağlamaktadir. Böylece, sürekli Thread oluşturmak ve kaldırmak gibi ciddi
    iş yükü getiren işlemlerin runtime sırasında yapılmasına gerek kalmaz.  Bu da önemli ölçüde performans artışına
    yol açar.

    Özelikle web-sunucu ortamlari için elverişli bir method sunar.
 */
public class MT07ThreadPool {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(3);//eş zamanlı sadece 5 thread run edecek threadpool create edildi

        ThreadOlustur th1=new ThreadOlustur("thread 1");
        ThreadOlustur th2=new ThreadOlustur("thread 2");
        ThreadOlustur th3=new ThreadOlustur("thread 3");
        ThreadOlustur th4=new ThreadOlustur("thread 4");
        ThreadOlustur th5=new ThreadOlustur("thread 5");
        ThreadOlustur th6=new ThreadOlustur("thread 6");
        ThreadOlustur th7=new ThreadOlustur("thread 7");
        ThreadOlustur th8=new ThreadOlustur("thread 8");
        ThreadOlustur th9=new ThreadOlustur("thread 9");
        ThreadOlustur th10=new ThreadOlustur("thread 10");

      // th1.start();
      // th2.start();
      // th3.start();
      // th4.start();
      // th5.start();
      // th6.start();
      // th7.start();
      // th8.start();
      // th9.start();
      // th10.start();
        service.execute(th1);
        service.execute(th2);
        service.execute(th3);
        service.execute(th4);
        service.execute(th5);
        service.execute(th6);
        service.execute(th7);
        service.execute(th8);
        service.execute(th9);
        service.execute(th10);
service.shutdown();

    }
}
class ThreadOlustur extends Thread{
    private  String  threadAdi;

    public ThreadOlustur(String threadAdi) {
        this.threadAdi = threadAdi;
    }

    @Override
    public void run() {
        System.out.println(threadAdi+"  çalışmaya başladı...");
        try {//her bir thread islem süresi rastgele olarak atayan veriable create edildi(500 - 3333 mls)
            int rastgeleSüre = ThreadLocalRandom.current().nextInt(500, 3333);
            Thread.sleep(rastgeleSüre);
            System.out.println(threadAdi + " calışma suresi : " + rastgeleSüre);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadAdi+" durdu...");
    }


}
