package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

import java.util.ArrayList;
import java.util.Collections;

public class Zad4_18 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("Julia");
        lista.add("Agata");
        lista.add("Zenek");
        lista.add("Jarek");
        lista.add("Kasia");
        lista.add("Dominik");
        System.out.println("Elementy nieposortowane: ");
        for (int i = 0; i < lista.size(); i++) {
            if (i<lista.size()-1){
                System.out.print(lista.get(i)+", ");
            }else{
                System.out.println(lista.get(i)+". ");
            }
        }
        Collections.sort(lista);
        System.out.println("Elementy po sortowaniu: ");

        for (int i = 0; i < lista.size(); i++) {
            if (i<lista.size()-1){
                System.out.print(lista.get(i)+", ");
            }else{
                System.out.println(lista.get(i)+". ");
            }
        }
    }
}
