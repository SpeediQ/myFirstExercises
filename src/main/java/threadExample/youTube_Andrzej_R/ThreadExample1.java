package threadExample.youTube_Andrzej_R;

class newThread implements Runnable {

    private String name;
    Thread t; //potrzebujemy referecję do zmiennej typu Thread

    newThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Uruchomiono wątek potomny " + name + ".");

        try {
            System.out.println("Wątek potomny " + name + " jest uśpiony.");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Zakończono działanie wątku potomnego " + name + ".");
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        new newThread("JEDEN");
        new newThread("DWA");
        new newThread("TRZY");

        try {
            System.out.println("Usypiam wątek główny");
            Thread.sleep(8000);
            System.out.println("Wznawiam wątek główny");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Zakończono wątek główny");

    }

}
