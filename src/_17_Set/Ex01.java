package _17_Set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

       /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan array elemanalrı set'e convert edn bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
     */


    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        elementEkle(hs,arr);
        System.out.println("***");
        elementEkle(hs,new int[]{34,35,45,61,38,41});
    }

<<<<<<< HEAD
    /* !mrc main
        Set<Integer> st = new HashSet<>();
        int arr[] = new int[] {1,2,3} ;

        elementEkle(st, arr);

     !mrc main end
     */

||||||| f08342f

=======
    private static void elementEkle(HashSet<Integer> hs, int[] arr) {
        for (Integer sayi:arr) {
            hs.add(sayi);
        }
        yazdir(hs);
    }
    public  static  void  yazdir(HashSet<Integer> hs){
        for (Integer s:hs) {
            System.out.print(s+" ");
        }
>>>>>>> 65834c7f9c86d990d7693be605134558cb726715
    }
    /* !mrc methods
    private static void elementEkle(Set<Integer> st, int[] arr) {
        for (int each: arr) {
            st.add(each);
        }
        writeSetElement(st);
    }

    private static void writeSetElement(Set<Integer> st) {
        System.out.println(st);
    }
    !mrc methods end
     */


}
