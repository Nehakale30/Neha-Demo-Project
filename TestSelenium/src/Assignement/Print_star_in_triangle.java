package Assignement;

public class Print_star_in_triangle {

    public static void main(String[] args) {

        for(int i=0; i<3; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }

        int num=1;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num++);
            }
            System.out.println();
        }

    }
}
