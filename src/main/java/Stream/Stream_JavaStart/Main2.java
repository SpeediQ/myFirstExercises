package Stream.Stream_JavaStart;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zosia","Dorota", "Paweł", "Dorota", "Wojtek", "Karolina");

        List<User> userList = names.stream()
                .filter(string->string.endsWith("a"))
                //.sorted()
                // sortowanie zadziała, ale na wszelki wypadek poniżej jest pokazane jak to zrobić już po zmapowaniu
                .map(string -> new User(string, new Random().nextInt(71)))
                .sorted(Comparator.comparing(User::getName))
                // map przekształca w jednego strumienia w drugi
                //.filter(user->user.getName().endsWith("a")) // jak już zmapujemy to odnosimy się do usera więc trzeba się odwołać do getName
                .collect(Collectors.toList());

        System.out.println(userList);
    }

}
class User{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Użytkownik "+name+" ma lat "+age;
    }
}

