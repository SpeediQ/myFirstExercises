package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

public class Zad4_6 {
    public static void main(String[] args) {
        int suma, n, i, j;

        n = 10;
        suma = 0;

        int[][] macierz = new int[n][n];

        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {
                if (i == n - 1 - j) {
                    macierz[i][j] = i;
                    suma+=macierz[i][j];

                } else {
                    macierz[i][j] = 0;
                }
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma = " +suma);
    }
}
