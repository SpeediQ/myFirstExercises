package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_15 {
    public static void main(String[] args) {
        int i=1,suma=0;
        while(i<=100){
            if (i%2!=0){
                suma+=i;
            }
            i++;
        }
        System.out.println(suma);
    }
}
