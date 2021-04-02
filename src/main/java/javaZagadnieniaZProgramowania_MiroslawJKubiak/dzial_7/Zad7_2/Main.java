package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_7.Zad7_2;

//Program tworzy nowy wątek poprzez imlementację interfejsu Runnable.
class MyThread implements Runnable {
    int counter;
    String nameOfThread;

    MyThread(String name) {
        this.counter = 0;
        this.nameOfThread = name;
    }

    @Override
    public void run() {
        System.out.println(nameOfThread + " startuje.");
        try {
            do {
                Thread.sleep(500);
                System.out.println(nameOfThread + ", licznik= " + counter);
                counter++;
            } while (counter < 10);
        } catch (InterruptedException exc) {
            System.out.println(nameOfThread+ " przerwany.");
        }
        System.out.println(nameOfThread+" zakończony");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Mój wątek startuje.");
        MyThread mt = new MyThread("Wątek1");

        Thread newThread = new Thread(mt);

        newThread.start();

        do {
            try{
                Thread.sleep(10000);;
            } catch (InterruptedException e) {
                System.out.println("Główny wątek został przerwany.");
            }
        }while (mt.counter !=10);

        System.out.println("Główny wątek został zakończony");
    }
}
