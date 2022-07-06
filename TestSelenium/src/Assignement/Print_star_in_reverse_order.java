package Assignement;

public class Print_star_in_reverse_order {

    public static void main(String[] args) {

       /* for(int i=3; i>=1; i--){
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println("*");

        }*/

    for(int i=5; i>0 ; i--){
        for (int j=i-1 ; j>0; j--){
            System.out.print("*");
        }
        System.out.println("*");
    }
    }
}
