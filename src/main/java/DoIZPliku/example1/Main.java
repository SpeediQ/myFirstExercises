package DoIZPliku.example1;


import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        new ReadFile().read();
        System.out.println("--------------\nPrzypisywanie:\n");
        new ReadFile().createBuffer();
    }
}
