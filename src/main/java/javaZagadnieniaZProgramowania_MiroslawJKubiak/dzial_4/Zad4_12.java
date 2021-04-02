package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

public class Zad4_12 {
    public static void main(String[] args) {
        int[] liczby = new int[]{574, 303, 34, 125, 8, 23};
        int x, i, j;
        System.out.println("Dla liczby: ");
        for (i = 0; i <= 5; i++) {
            if (i <= 4) {
                System.out.print(liczby[i] + ", ");
            } else {
                System.out.print(liczby[i] + ".");
            }
        }
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                if (liczby[j - 1] > liczby[j]) {
                    x = liczby[j - 1];
                    liczby[j - 1] = liczby[j];
                    liczby[j] = x;
                }
            }
        }
        System.out.println("");
        System.out.println("Liczby uporządkowane to: ");
        for (i = 0; i <= 5; i++) {
            if (i <= 4) {
                System.out.print(liczby[i] + ", ");
            } else {
                System.out.print(liczby[i] + ".");
            }
        }
        System.out.println("");

    }
}