package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_10 {
    public static void main(String[] args) {
        System.out.println("Program za pomocą pętli for sumuje liczby parzyste od 1-100");
        int suma = 0;
        int suma2 = 0;

        // pierwszy sposób (prymitywny)
        for (int i = 0; i<=100; i+=2){
            suma+=i;
        }
        System.out.println(suma);

        // drugi sposób - właściwy
        for (int i=1; i<=100; i++){
            if (i%2==0){
                suma2+=i;
            }
        }
        System.out.println(suma2);
    }
}
