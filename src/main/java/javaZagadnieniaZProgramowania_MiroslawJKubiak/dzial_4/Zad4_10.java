package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

public class Zad4_10 {
    public static void main(String[] args) {
        int n=10,w1=1,w2=2,i,j;

        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];

        for (i=0;i<a.length;i++){
            for (j=0;j<a.length;j++){
                a[i][j]=w1;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (i=0;i<b.length;i++){
            for (j=0;j<b.length;j++){
                b[i][j]=w2;
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        for (i=0;i<c.length;i++){
            for (j=0;j<c.length;j++){
                c[i][j]=b[i][j]-a[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


    }
}

