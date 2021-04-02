package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_21 {
    public static void main(String[] args) {
        System.out.println("Za pomocą podwójnej pętli while");
        int wiersze = 1, kolumny;

        while (wiersze <= 10) {

            kolumny = 1;
            while (kolumny <= 10) {
                System.out.print(kolumny * wiersze + " \t");
                kolumny++;
            }
            System.out.println();
            wiersze++;
        }
    }
}
