public class a {
    public static void main(String[] args) {

        String s1 = "haluk";
        String s2 = "haluk";
        String s3 = new String("haluk");
        String s4 = new String("haluk");

        System.out.println(s1 == s2);// True
        System.out.println(s1.equals(s2));// True
        System.out.println(s3 == s4);// FALSE
        System.out.println(s3.equals(s4));// True
        /*

 String s1 = “text”; kullanımı, eğer varsa, string sabit havuzunda (string constant pool) bir örneği yeniden kullanır.
  Yoksa havuz içerisinde yeniden alan oluşturur. Bu durum Java’ya özgü Java Sanal Makinesi (JVM) tarafından gerçekleştirilen bir durumdur.

s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir. s3 ve s4 ise farklı nesneleri ifade eder.
s1 == s2 , s1 ve s2 ‘nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
 Böylece ekrana TRUE yazdırır.
s1.equals(s2) ifadesi ise, nesneler içerisindeki değerleri (haluk) karşılaştırdığı için ekrana TRUE yazdırır.
Bildiğimiz gibi == operatörü hafızadaki adresleri karşılaştırır, s3 ve s4 birbirinden farklı nesneler oldukları için farklı adreslerde tutulurlar.
 Bu yüzden s3 == s4 ifadesi ekrana FALSE yazdırır.
s3.equals(s4) ifadesi ise, nesneler içerisindeki değerleri (haluk) karşılaştırdığı için ekrana TRUE yazdırır.

         */
    }
}
