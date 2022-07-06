package Assignement;

public class Remove_duplicate_element_from_multiple_array {

    public static void main(String[] args) {

        int[] a = {10,30,20,50,60};
        int[] b = {20,80,40,60,90};
        int[] c = {25,35,60,20,80};

        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    if (a[i]==b[j] && b[j]==c[k]) {
                        System.out.println(a[i]);
                    }
                }
            }
        }
    }
}
