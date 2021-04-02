package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

public class Zad4_3 {
    public static void main(String[] args) {

        int j, i, n,suma;
        n = 10;
        suma=0;
        int[][] macierz = new int[n][n];

        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {
                if (i == j) {
                    macierz[i][j]=1;
                    System.out.print(macierz[i][j]+" ");
                    suma+=macierz[i][j];

                } else {
                    macierz[i][j]=0;
                    System.out.print(macierz[i][j]+" ");
                    suma+=macierz[i][j];
                }
            }
            System.out.println();

        }
        System.out.println("Suma wyróżnionych elementów = "+suma);


    }
}
