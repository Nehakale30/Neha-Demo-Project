package Assignement;

import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Find_second_large_number_of_array {

    public static void main(String[] args){

        int [] a= {1,8,3,4,5,7,6,9};
/*
        for (int i=0; i<a.length; i++){
            Arrays.sort(a);
            System.out.println(a[a.length-2]);
            break;
        }*/
        for(int b:a){
        System.out.print(b+" ");}
        System.out.println();
        int temp;
        for(int i=0; i<a.length;i++){
            for (int j=i+1; j<a.length;j++){
                if(a[i]>a[j]){
                   temp = a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
            }
        }
        for(int b:a){
            System.out.print(b+" ");}

        System.out.println(a[a.length-2]);
    }
}
