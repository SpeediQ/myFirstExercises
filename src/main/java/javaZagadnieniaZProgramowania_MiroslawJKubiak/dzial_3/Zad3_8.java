package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_8 {
    public static void main(String[] args) {
        System.out.println("Program za pomocą funkcji do while sumuje liczby całkowite od 1-100");
        int i=1;
        int suma = 0;

        do {
            suma += i;

            i++;

        }while(i<=100);
        System.out.println(suma);
    }
}
