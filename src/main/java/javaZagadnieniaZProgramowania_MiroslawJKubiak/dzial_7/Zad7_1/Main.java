package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_7.Zad7_1;

class MyFirstThread extends Thread {
    public void run() {
        System.out.println("Mój pierwszy wątek");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new MyFirstThread();
        thread1.start();
    }
}
