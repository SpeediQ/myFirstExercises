package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_24 {
    public static void main(String[] args) {
        System.out.println("Za pomocą pętli while");

        char znak;

        znak = 'A';
        while (znak <= 'Z') {
            if (znak < 'Z') {
                System.out.print(znak + ", ");
            }else {
                System.out.print(znak + ".");
            }
            znak++;
        }
        System.out.println();
        znak='Z';
        while (znak>='A'){
            if (znak>'A'){
                System.out.print(znak+", ");
            }else{
                System.out.print(znak+".");
            }
            znak--;
        }
    }
}
