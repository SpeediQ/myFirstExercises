package threadExample.MyExercises;

import java.util.Scanner;

public class InterruptThreadCarDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadCar car = new ThreadCar();
        car.setSpeed(30);
        Scanner sc = new Scanner(System.in);

        System.out.println("Wpisz: start, stop, end");

        while (sc.hasNext()) {
            String command = sc.next();
            switch (command) {
                case "start":
                    car.drive();
                    break;
                case "stop":
                    car.stop();
                    System.out.println("W sumie przejechałeś: " + car.getDistance());
                    break;
                case "end":
                    return;
            }
        }
    }
}
