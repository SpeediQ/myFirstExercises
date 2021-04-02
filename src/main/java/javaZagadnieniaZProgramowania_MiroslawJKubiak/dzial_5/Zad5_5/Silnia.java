package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_5;

public class Silnia {
    public long zWartosci(int liczba){

        long zwrot=1;
        if (liczba>=2){
            zwrot = liczba* zWartosci(liczba-1);
        }
        return zwrot;
    }
}
