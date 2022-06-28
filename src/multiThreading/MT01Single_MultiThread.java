package multiThreading;

public class MT01Single_MultiThread {
    /*

      ============================================ THREAD, PROCESS=========================================================
    Thread : Kelime manası iplik olmasına karşın IT alanında iş parçacığı olarak adlandırılır.
    Thread, Process olarak adlandırılan ve her bir çalışan programın alt iş parçaçığı olarak düşünülebilir.
    Single-Thread: Tek iş parcacığı vardır. Ve tüm işler sıra ile yapılır.JVM default olarak Single-Thread create eder.
    Multi-Thread: Bir den fazla iş parçacığı vardır ve bu işler aynı anda yapılabilir (farklı işlemciler yardımıyla)

    Javada 2 yöntem ile Thread oluşturmak mümkündür.
    ----------------------------------------------
    1- Thread classından bir class extends (türeterek) edilerek
    2- Runnable Interface'inden implements edilerek.--> best practice

    Thread class'ının yaygın kullanılan metotlari:
    -----------------------------------------------
  *  public void run(): Bir threat'in calistiracagi islemleri tanımlamak amacıyla kullanlır.
                        Bir thread create edildiğinde içinde ne çalışacagını run() method override edilerek olusturulur.
                        Bir thread'in yapacagı action run() method içinde tanımlanır.

  *  public void start(): Bir thread'in baslatilmasini saglar.JVM, thread'in run() methodunu calistirir.

  *  public void sleep(long miliseconds): Bir thread'in belirtilen sure (ms) boyunca bekletilmesini saglar.
  *  public void join(): Bir thread olmesini (bitmesi) beklemek icin kullanilir.
                        Thread'in olmesi beklendikten sonra sıradaki komutlar run edilir.Sıralı run işlemlerinde gayet önemlidir.
  *  public int getPriority(): Aynı anda birden cok çalışan Thread'ler için bir thread'in önceligini dondurur.
    public int setPriority(int priority): Bir thread icin oncelik ayarlamaya yarar.
    public String getName(): Bir thread'in adini dondurur.
    public void setName(String name): Bir thread'e isim vermeye yarar.
    public Thread currentThread(): Su an calisan thread'in referansını dondurur.
    public int getId(): Bir thread'in id numarasını dondurur.
    public Thread.State getState(): Bir thread'in state (durum)'ini dondurur.
    public boolean isAlive(): Bir thread'in canlı (alive) olup olmadığını soyler.
    public void yield(): Aktif olan bir thread'in gecici olarak durdurulmasini ve baska thread'lerin calistirilmasini saglar.
    public boolean isDaemon(): Bir thread'in Deamon(şeytan:arka planda çalışan garbage collector gibi JVM'in kapanmasını engellemeyen önceliği düşük thread'ler)
                               threat olup olmadıgını test eder. Gerekmedikçe kullanılmamalı. Arka planda çalışmayacak thread'ler için kulanılırsa JVM kapatabilir
    public void setDaemon(boolean b): Bir thread'i deoman thread olarak işaretler.
  *  public void interrupt(): Thread kesintiye ugratır.mevcut App çalışırken flash bellek takma gibi eş zamalılıgı kesmek için kullanılır.
                              Usp klavye port bu thread'i kullanır
    public boolean isInterrupted(): Bir thread'in kesilip kesilmediğni test eder.


     */
    public static void main(String[] args) throws InterruptedException {

        System.out.println("   ***  Single thread    ***   ");
        long singleBasla=System.currentTimeMillis();
        SingleThreadSayac sT1=new SingleThreadSayac(1);
        sT1.sThreadsayac();

        SingleThreadSayac sT2=new SingleThreadSayac(2);
        sT2.sThreadsayac();
        long singleBitis=System.currentTimeMillis();
        System.out.println("Single Thread run süresi :"+(singleBitis-singleBasla));

        System.out.println("   ***  multi thread    ***   ");
        long multiBasla=System.currentTimeMillis();
        MultiThreadSayac mT3=new MultiThreadSayac(3);
        mT3.start();//mT3 başaltıldı
        MultiThreadSayac mT4=new MultiThreadSayac(4);

        mT4.start();//mT4 başaltıldı
        mT3.join();//Bir thread'in bitmesini(ölmesini) beklemek için join() meth. kullanılır
                   // gereksiz yere join() meth. kulanılması multiThread'i (app) yavaşlatacagı için dikkatli kullanılmalı
        mT4.join();//mT4 thread bittmeden alt satır run olmaz.Bu komut mT4 bitmrsini bekletir.
        long multiBitis=System.currentTimeMillis();
        System.out.println("Multi Thread run süresi :"+(multiBitis-multiBasla));
    }
}
class SingleThreadSayac{//Multiple Class

    private int threadNo;

    public SingleThreadSayac(int threadNo) {
        this.threadNo = threadNo;
    }
    public void sThreadsayac(){
        for (int i = 0; i <=10; i++) {
            System.out.println("i " +i+" için çalışan thread no : "+threadNo);
          // try {
          //     Thread.sleep(50);
          // } catch (InterruptedException e) {
          //     throw new RuntimeException(e);
          // }
        }
    }
}
class MultiThreadSayac extends Thread {//Multiple class 1. yol-> Thread class'tan extends edildi
    private int threadNo;

    public MultiThreadSayac(int threadNo) {
        this.threadNo = threadNo;
    }
    public void mThreadsayac(){//action yapan process
        for (int i = 0; i <=10; i++) {
            System.out.println("i " +i+" için çalışan thread no : "+threadNo);
           //try {
           //    Thread.sleep(50);
           //} catch (InterruptedException e) {
           //    throw new RuntimeException(e);
           //}
        }
    }

    @Override
    public void run() {//hizmetciye iş tanımı yapıldı(Thread : hizmetci) run() method olmazs thread çalışmaz
        mThreadsayac();
    }
}


