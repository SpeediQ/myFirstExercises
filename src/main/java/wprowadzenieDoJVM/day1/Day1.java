package wprowadzenieDoJVM.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Day1 {
    public static void main(String[] args) throws IOException {

        Path pathToFile = Path.of("src/main/resources/day1input.txt");
        Stream<String> lines = Files.lines(pathToFile);
        int sum = lines
                .map(Integer::valueOf)
                .mapToInt(Day1::calculateFuelByMass)
                .sum();
        System.out.println(sum);

        double integer = calculateFuelByMass(100756);
        System.out.println((int) integer);


    }

    private static int calculateFuelByMass(int mass) {
        return (int) Math.floor(mass / 3) - 2;
    }
}
