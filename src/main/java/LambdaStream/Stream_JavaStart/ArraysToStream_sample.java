package LambdaStream.Stream_JavaStart;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysToStream_sample {
    public static void main(String[] args) {
        String[] tab1 = {"Ala", "Wojtek", "Łukasz", "Kasia", "Marcin", "Konrad", "Iwona", "Wiola", "Ala"};
        List<String> list1 = Arrays.asList("Ala", "Wojtek", "Łukasz", "Kasia", "Marcin", "Konrad", "Iwona", "Wiola", "Ala");
        String[] liczby = {"1", "2", "3"};

        Arrays.stream(tab1)
                .filter(a -> a.endsWith("a"))
                .collect(Collectors.toSet())
                .forEach(a -> System.out.print(a + " "));
        System.out.println();
        list1.stream()
                .filter(a -> a.endsWith("a"))
                .sorted()
                .forEach(a -> System.out.print(a + " "));
        System.out.println();
        list1.stream()
                .filter(a -> a.endsWith("a"))
                .forEach(a -> System.out.print(a + " "));
        System.out.println("\n");
        Set<String> nowa = list1.stream()
                .filter(a -> a.endsWith("a"))
                .collect(Collectors.toSet());

        System.out.println(nowa);

//        Arrays.stream(liczby)
//                .map()
    }
}
