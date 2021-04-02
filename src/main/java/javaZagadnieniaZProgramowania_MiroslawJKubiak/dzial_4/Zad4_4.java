package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

public class Zad4_4 {
    public static void main(String[] args) {
        int i, j, suma,n=10;
        suma=0;

        int[][]tablica= new int[n][n];

        for (j=0;j<tablica.length;j++) {
            for (i = 0; i < tablica.length; i++) {
                if (i==j) {
                    tablica[j][i] = i;
                    System.out.print(tablica[j][i]+" ");
                    suma+=tablica[i][j];
                }else{
                    tablica[j][i]=0;
                    System.out.print(tablica[j][i]+" ");
                    suma+=tablica[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Suma = "+suma);
    }
}
