package test1;

import java.util.Arrays;
import java.util.List;

public class PetlaForEach {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("String1", "String2", "String3", "String4", "String5", "String6");
        for (String wartosc : lista) {
            System.out.println(wartosc);
        }
    }
}
