package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_6 {
    public static void main(String[] args) {
        System.out.println("Wyświetla liczby całkowite za pomoca pętli while od 1-20");
        int x=1;
        while (x<=20){
            if (x<20){
                System.out.print(x+", ");
            } else {
                System.out.print(x);
            }
            x++;
        }
    }
}
