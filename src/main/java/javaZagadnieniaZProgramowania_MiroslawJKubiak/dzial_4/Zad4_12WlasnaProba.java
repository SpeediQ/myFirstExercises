package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

public class Zad4_12WlasnaProba {
    public static void main(String[] args) {
        int[] liczby = new int[]{574, 303, 34, 125, 8, 23,0,2,3,6,52,365,324,623,6589,69854,2,3,56,78};
        System.out.println("Liczby: ");
        int x;
        for (int i = 0; i < liczby.length; i++) {
            System.out.print(liczby[i] + " ");
        }
        System.out.println("\nUporzątkowane rosnąco: ");

        for (int i = 1; i <= liczby.length-1; i++) {
            for (int k = liczby.length-1; k >=i ; k--) {
                if (liczby[k-1]>liczby[k]){
                    x= liczby[k-1];
                    liczby[k-1]=liczby[k];
                    liczby[k]=x;
                }
            }

        }
        for (int i = 0; i < liczby.length; i++) {
            System.out.print(liczby[i] + " ");
        }

    }
}
