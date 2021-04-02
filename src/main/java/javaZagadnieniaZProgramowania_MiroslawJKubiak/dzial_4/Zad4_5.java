package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

public class Zad4_5 {
    public static void main(String[] args) {
        int i, j, suma,n=10;
        suma=0;

        int[][]tablica= new int[n][n];

        for (j=0;j<tablica.length;j++) {
            for (i = 0; i < tablica.length; i++) {
                if (i==n-1-j) {
                    tablica[i][j] = 1;
                    System.out.print(tablica[i][j]+" ");
                    suma+=tablica[i][j];
                }else{
                    tablica[i][j]=0;
                    System.out.print(tablica[i][j]+" ");
                    suma+=tablica[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Suma = "+suma);
    }
}
