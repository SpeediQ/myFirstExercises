package sda.programowanieII_PoziomSredniozaawansowany.watki.thread;

class Task implements Runnable{
    private int count;
    private int time;

    public Task(int count, int time) {
        this.count = count;
        this.time = time;
    }

    @Override
    public void run() {
        int c = count;
        while (c-- >0){
            try{
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from runnable!!!");
        }

    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        Thread myThres = new Thread(new Task(10,200));

        Thread lol = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Try");
            }
        });

        System.out.println("Main Thread");
        myThres.start();
        lol.start();



    }

}
