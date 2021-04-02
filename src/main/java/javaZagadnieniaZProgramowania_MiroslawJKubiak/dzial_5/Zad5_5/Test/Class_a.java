package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_5.Test;

public class Class_a {
    int obliczenia(int liczba){
        int zwrot = 2;
        if (liczba>=2){
            zwrot = liczba*2*obliczenia(liczba-1);
        }
        return zwrot;
    }
}
