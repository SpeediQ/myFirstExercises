package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_9 {
    public static void main(String[] args) {
        System.out.println("Program sumuję liczby całkowite od 1-100 przy pomocy pętli while");

        int i=1;
        int suma=0;

        while(i<=100){
            suma += i;

            i++;
        }
        System.out.println(suma);
    }
}
