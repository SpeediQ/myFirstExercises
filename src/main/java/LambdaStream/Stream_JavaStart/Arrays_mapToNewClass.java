package LambdaStream.Stream_JavaStart;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Arrays_mapToNewClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dorota", "Pawęł", "Dorota", "Wojtek", "Karolina", "Zosia", "Asia");
        List<User> userList = names.stream()
                .filter(n -> n.endsWith("a"))
                // Stringi posiadają komperator dlatego nie trzeba go tworzyć=ć (chyba że chcemy posortować w dowolny wybrany przez nas sposób)
//                .sorted(new Comparator<String>() {
//                    @Override
//                    public int compare(String o1, String o2) {
//                        return -(o1.compareTo(o2));
//                    }
//                })
                .map(string -> new User(string, new Random().nextInt(21)))
                // W przeciwieństwie do strumienia klasa User nie posiada Comperatora i trzeba go stworzyć samemu
//                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                // w Javie 8 wprowadziła fajny bajer:
                .sorted(Comparator.comparing(User::getAge))//.reversed)
                .collect(Collectors.toList());
        System.out.println(userList);
    }
}

class User {
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

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " ( lat " + age + ") ";
    }
}
