package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_7 {
    public static void main(String[] args) {
        System.out.println("Program sumuje liczby całkowite od 1 - 100 za pomocą pętli for");
        int suma = 0;
        int sprawdzenie = 0;
        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
            sprawdzenie = suma;
            if (i==100){
                System.out.println(suma);
            }

        }
        System.out.println("Można też to zrobić bez instrukcji if = "+sprawdzenie);
    }
}
