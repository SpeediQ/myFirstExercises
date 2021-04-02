package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

public class Zad4_8 {
    public static void main(String[] args) {
        int i, j, n = 10;

        int[][] a = new int[n][n];
        int[][] b = new int[n][n];

        System.out.println("Tablica A");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                a[i][j]=j;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nTablica B");
        for (i = 0; i < b.length; i++) {
            for (j = 0; j < a.length; j++) {
                b[i][j]=a[i][j];
                System.out.print(b[j][i]+" ");
            }
            System.out.println();
        }




    }
}
