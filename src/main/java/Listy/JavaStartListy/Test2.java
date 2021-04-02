package Listy.JavaStartListy;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] liczby ={1,3,4,8,33,2,77,5,3,6,9};

        int i = Arrays.binarySearch(liczby,77);
        System.out.println(i);
    }
}
