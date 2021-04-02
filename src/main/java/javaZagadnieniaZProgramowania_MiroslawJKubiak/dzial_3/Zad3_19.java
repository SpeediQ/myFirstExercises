package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_19 {
    public static void main(String[] args) {
        int n = 10, kolumy, wiersze;

        System.out.println("Program wyświetla tabliczkę mnożenie do 100  ");
        for (wiersze = 1; wiersze <= n; wiersze++) {

            for (kolumy = 1; kolumy <= 10; kolumy++) {

                System.out.print(kolumy*wiersze + " "+"\t");
            }
            System.out.println();
        }
    }
}
