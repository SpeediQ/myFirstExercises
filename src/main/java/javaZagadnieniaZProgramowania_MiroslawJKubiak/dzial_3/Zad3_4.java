package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_4 {
    public static void main(String[] args) {
        System.out.println("Program wyświetla za pomocą instrukcji for liczby całkowite od 1-20 ");
        for (int x =1;x<=20;x++){
            if(x<20){
                System.out.print(x+", ");
            } else {
                System.out.print(x);
            }
        }
    }
}
