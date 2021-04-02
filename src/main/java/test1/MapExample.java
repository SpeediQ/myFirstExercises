package test1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"jeden");
        mapa.put(1,"dwa"); // nadpisało wartość z klucza 1
        mapa.put(3,"trzy");
        mapa.put(4,"cztery");


        System.out.println(mapa.containsValue("trzy"));
        System.out.println("wypisywanie samym wartośći: (mapa.values()): "+ mapa.values());

        for (Map.Entry<Integer,String> mapka : mapa.entrySet()){
            int key = mapka.getKey();
            String value = mapka.getValue();
            System.out.println(key+" : "+value);
        }

        List<String> lista = Arrays.asList("Jeden","Dwa","Trzy");
        for (String nazwa : lista) {
            System.out.println(nazwa
            );
        }
    }
}
