package systemyLiczbowe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wynik = "+binarySystem(scanner));

    }

    private static int binarySystem(Scanner scanner) {
        String input = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char valueChar = input.charAt(i);
            int value = Integer.parseInt(String.valueOf(valueChar));
            if (value > 1) {
                System.out.println("WRONG VALUE! Podałeś błędną nazwę! W systemie binarnym kożystamy tylko z wartości 1 lub 0");
                System.exit(0);
            }
            else {
                sum += value * Math.pow(2, input.length()-(i+1));
            }
        }
        return sum;
    }

}
