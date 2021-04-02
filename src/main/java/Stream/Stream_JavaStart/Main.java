package Stream.Stream_JavaStart;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dorota", "Paweł", "Wojtek", "Karolina", "Dorota");
        Stream<String> stream1 = names.stream();
        // Pierwsza metoda
        System.out.println("Pierwsza metoda\n-------------------------");
        Stream<String> stream2 = stream1.filter(s -> s.endsWith("a"));
        stream2.forEach(n -> System.out.println(n));


        // Druga metoda
        System.out.println("\nDruga metoda\n-------------------------");
        names.stream()
                .filter(n -> n.endsWith("a"))
                .forEach(System.out::println);
        // odfiltrować mężczyzn i zapisać do listy


        System.out.println("\nTrzecia metoda\n-------------------------");
        List<String> imiona = Arrays.asList("Dorota", "Paweł", "Wojtek", "Karolina", "Dorota");
        Stream<String> imiona1 = names.stream();
        Stream<String> stremFiltered = imiona1.filter(n -> n.endsWith("a"));
        Set<String> filteredNames = stremFiltered.collect(Collectors.toSet()); // Set nie wyświetla dwa razy tego samego- "Dorota
        System.out.println(filteredNames);

        // filter - można dalej przetwarzać

        // forEach oraz collect są metodami terminalnymi - kończącymi

    }
}
//        Strumień będzie w nieskończoność wyświetlał wartości +1
//        Stream<Integer> iterate = Stream.iterate(1, n -> n + 1);
//        iterate.forEach(n-> System.out.println(n));
