package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_6;

public class Class_a {
    public double liczbyTrojkate(int iloscLiczb){
        double zwrot =1;
        if (iloscLiczb >= 2){
            zwrot=iloscLiczb+liczbyTrojkate(iloscLiczb-1);
        }
        return zwrot;
    }
}
