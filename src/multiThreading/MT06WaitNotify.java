package multiThreading;

/*
============================ WAIT, NOTIFY ==========================
   object.wait()-->(obj ile çalışır Multi-Thread ile kullanılır) methodu bir thread'i suresiz olarak askıya alir(suspent).
    Diğer bir ifade ile bu thread'in kilitlemiş (locked) olduğu bir kaynağı salıvermesini ve askıya geçmesini sağlar.
    Thread bu durumdan bir başka thread Onu bilgilendirirse (notify) çıkabilir.

   object.notify()-->(obj ile çalışır Multi-Thread ile kullanılır) metodu ise aynı obj üzerinde wait (askıya alınan) bir
    thread'in uyanmasini saglar.  notify : Bildirmek, haber vermek, ihbar etmek
   Object.notifyAll() metodu bir nesne üzerinde askıya alınan tum thread'lerin uyandirilmasini saglar.

   Bu methodlar, thread'ler arasi iletişim (inter-Thread communication) metodu olarak kullanılır.
   Aynı  class'ta birden çok method'lar wait() ve notify() yapılabilir.
 */
public class MT06WaitNotify {
    public static double bakıye = 0;

    public static void main(String[] args) {

        MT06WaitNotify islem = new MT06WaitNotify();//obj create edildi

        Thread paraCekTh = new Thread(new Runnable() {
            @Override
            public void run() {
                //try {//paraçekme işlemi 15 sn bekletildi para yatırma işlemi öne çekildi
                //    Thread.sleep(15000);
                //} catch (InterruptedException e) {
                //    throw new RuntimeException(e);
                //}

                islem.paraCek(200);
            }
        });

        Thread paraYatırTh = new Thread(new Runnable() {
            @Override
            public void run() {

                islem.paraYatır(500);
            }
        });
        paraCekTh.start();
        paraYatırTh.start();
    }

    public void paraCek(double cekilecekMiktar) {
        if (cekilecekMiktar <= bakıye) {
            bakıye -= cekilecekMiktar;
            System.out.println("Agam parayı çektin yeni bakıyen : " + bakıye);
        } else {


            synchronized (this) {

                try {
                    //paraCekTh threadi bir başka thread notify() veya notiyfAll() meth call edene kadar askıya (suspent bekleme) alınır.
                    //Ancak bunun olabilmesi için wait obj. nin kendine ait bir gözlemcisi(monitor) olması gerekir.
                    //synchronized block ve synchronized static veya synchronized obj. gözlenmesi (monitor) saglar.
                    wait();//bu method notify gelene  kadar askıya (suspent) edildi
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //if ( bakıye < cekilecekMiktar) {
                //    System.out.println("Agam niddin olmayan parayı mı çekicen :(");
                //}

                bakıye -= cekilecekMiktar;
                System.out.println("Agam parayı çektin yeni bakıyen : " + bakıye);
            }
        }
       // if (bakıye < cekilecekMiktar) {
       //     System.out.println("Agam niddin olmayan parayı mı çekicen :(");
       // }
    }

    public void paraYatır(double yatırılacakMiktar) {
        bakıye += yatırılacakMiktar;
        System.out.println("agam gözün aydın para çepte :)" + bakıye);
        synchronized (this) {//synchronized(this)--> thread'in wiat-notify hali sisteme monitoring(gözlemleme) yapıldı...inter-thread comminication
            notify();
        }
    }
}
