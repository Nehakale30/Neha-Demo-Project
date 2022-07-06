package Assignement;

public class Reverse_String_without_using_reverse_func {

    public static void main(String[] args) {

        String s = "malayalam";
        char c;
        for(int i=s.length()-1; i>=0; i--){
            c =s.charAt(i);
            System.out.print(c);
            }
        }
    }


