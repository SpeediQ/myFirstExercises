package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

public class Zad4_7_PokazacNikodemowi {
    public static void main(String[] args) {
        int n = 10, suma1 = 0, suma2 = 0, i, j;

        int[][] macierz = new int[n][n];

        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {
                if (j <= 1) {
                    macierz[i][j] = (int) Math.pow(i, (j + 1));


                } else {
                    macierz[i][j] = 0;
                }

                if (j == 0) {
                    suma1 += macierz[i][j];
                }
                if (j == 1) {
                    suma2 += macierz[i][j];
                }

                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(suma1);
        System.out.println(suma2);
    }
}
