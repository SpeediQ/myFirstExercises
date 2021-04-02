package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

public class Zad4_16 {
    public static void main(String[] args) {
        int sumaNieparzysta, sumaParzysta, n;
        sumaNieparzysta = 0;
        sumaParzysta = 0;
        n = 100;

        int[] tablica = new int[n];

        for (int i = 0; i < n; i++) {
            tablica[i] = i + 1;
        }
        System.out.println("Wartości parzyste: ");
        for (int x : tablica) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
                sumaParzysta += x;
            }
        }
        System.out.println();
        System.out.println("Wartości nieparzyste: ");
        for (int x : tablica) {
            if (!(x % 2 == 0)) {
                System.out.print(x + " ");
                sumaNieparzysta += x;
            }
        }
        System.out.println();
        System.out.println("Suma wartości parzystych: "+sumaParzysta);
        System.out.println("Suma wartości nieparzystych: "+sumaNieparzysta);
    }
}
