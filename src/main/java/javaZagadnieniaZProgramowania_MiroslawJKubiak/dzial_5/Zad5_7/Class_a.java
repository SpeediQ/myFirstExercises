package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_7;

public class Class_a {
    public int ciagFibonaccieo(int wartosc){
        int zwrot=0;
        if (wartosc==1){
            zwrot = 1;
        }
        if (wartosc>1){
            zwrot=ciagFibonaccieo(wartosc-1)+ciagFibonaccieo(wartosc-2);
        }
        return zwrot;
    }
}
