package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_20 {
    public static void main(String[] args) {
        int wiersze = 1, kolumny;

do {

kolumny=1;
    do {
        System.out.print(kolumny*wiersze + " \t");
        kolumny++;
    } while (kolumny <= 10);

    System.out.println();

    wiersze++;
}while (wiersze<=10);


    }
}
