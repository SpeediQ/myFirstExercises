package exception.javastart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOExceptionExample {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("IOExceptionExample.txt");
        boolean exists = file.exists();
        System.out.println(exists);
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException exception) {
            System.out.println("Brak pliku IOExceptionExample.txt");
            System.out.println(exception.getMessage());
        }


    }
}
