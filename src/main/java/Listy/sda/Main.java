package Listy.sda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] liczby ={1,3,4,8,33,2,77,5,3,6,9};
//        int searchFor = 77;
        int i = Arrays.binarySearch(liczby,77);
        System.out.println(i);


//        for (int i = 0; i < liczby.length; i++) {
//            if (liczby[i]==77){
//                System.out.println("znalazłem: "+i);
//            }
//        }
    }



}
