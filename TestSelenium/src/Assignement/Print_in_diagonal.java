package Assignement;

public class Print_in_diagonal {

    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
           for(int j=1; j<=5; j++){
               if(i==j){
                   System.out.print("1");
               }
               else{
                   System.out.print(" ");
               }
           }
            //System.out.println("test");
        }
    }
}
