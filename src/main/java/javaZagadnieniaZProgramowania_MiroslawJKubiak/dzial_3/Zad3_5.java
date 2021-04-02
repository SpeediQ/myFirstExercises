package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_5 {
    public static void main(String[] args) {
        System.out.println("Program wyświetla liczby całkowite od 1-20");
        int x = 1;
        do {
            if (x < 20) {
                System.out.print(x + ", ");
            } else {
                System.out.print(x);
            }

            x++;
        } while (x <= 20);
    }
}
