package Java;

public class ReverseStringByWords {

    public static  String reverseString(String str){

       String words[] = str.split("\\s");
       String reverse="";

        for (String w:words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverse+=sb.toString()+" ";
        }

        return reverse.trim();
    }

    public static void main(String[] args) {
        System.out.println(ReverseStringByWords.reverseString("My Name Is Neha"));
    }
}
