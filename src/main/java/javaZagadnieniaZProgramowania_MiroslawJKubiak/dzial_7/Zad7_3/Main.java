package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_7.Zad7_3;

class myThread implements Runnable {
    int counter;
    Thread wtk;

    myThread(String name) {
        wtk = new Thread(this, name);
        counter = 0;
        wtk.start();
    }

    @Override
    public void run() {
        System.out.println(wtk.getName() + " startuje.");
        try {
            do {
                Thread.sleep(500);
                System.out.println(wtk.getName() + ", licznik = " + counter);
                counter++;
            } while (counter < 10);
        } catch (InterruptedException e) {
            System.out.println(wtk.getName() + " został przerwany.");
        }
        System.out.println(wtk.getName() + " został zakończony.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Mój wątek startuje!");

        myThread thread1 = new myThread("Wątek1");
        myThread thread2 = new myThread("Wątek2");
        myThread thread3 = new myThread("Wątek3");

        do {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Główny wątek został przerwany");
            }
        } while (thread1.counter < 10 || thread2.counter < 10 || thread3.counter < 10);
        System.out.println("Główny wątek został zakończony");

    }
}
