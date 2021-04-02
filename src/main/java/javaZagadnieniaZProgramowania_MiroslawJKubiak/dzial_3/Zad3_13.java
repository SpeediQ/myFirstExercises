package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_13 {
    public static void main(String[] args) {
        System.out.println("Za pomocą pętli for sumuje liczby nieparzyste z przedziału 1-100");
        int i, suma = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                suma+=i;

            }
        }
        System.out.println(suma);
    }
}
