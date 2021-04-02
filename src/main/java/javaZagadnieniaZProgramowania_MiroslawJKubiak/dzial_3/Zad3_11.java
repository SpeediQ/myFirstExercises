package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_11 {
    public static void main(String[] args) {
        int i = 1, suma =0;
        do{
            if(i%2==0){
                suma+=i;
            }
            i++;
        }while(i<=100);
        System.out.println(suma);
    }
}
