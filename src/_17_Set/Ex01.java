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

    /* !mrc main
        Set<Integer> st = new HashSet<>();
        int arr[] = new int[] {1,2,3} ;

        elementEkle(st, arr);

     !mrc main end
     */

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
