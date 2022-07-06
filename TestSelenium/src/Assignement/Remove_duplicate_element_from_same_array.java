package Assignement;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Remove_duplicate_element_from_same_array {

    public static void main(String[] args) {
         int[] a = {10,90,20,30,40,50,10,20,60,50};
         int[] b = {15,10,25,35,30,40,90};
         int[] c = new int[a.length + b.length];

        //LinkedHashSet<Integer> z= new LinkedHashSet<Integer>();
        /*TreeSet<Integer> z= new TreeSet<>();
         for(int i=0; i<a.length; i++){
             z.add(a[i]);
         }
        System.out.println(z);*/
        System.arraycopy(a,0, c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        System.out.println(Arrays.toString(c));

        LinkedHashSet<Integer> z= new LinkedHashSet<Integer>();
        for (int i=0; i<c.length; i++){
            z.add(c[i]);

        }
        System.out.println(z);
        System.out.println(c.length);
    }
}

