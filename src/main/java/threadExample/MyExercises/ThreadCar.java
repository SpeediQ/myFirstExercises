package threadExample.MyExercises;

public class ThreadCar implements Runnable {
    private long time;
    private int speed, distance;
    private Thread driveTask;


    @Override
    public void run() {
        time = System.currentTimeMillis();
        System.out.println("Ruszamy w drogę...");
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
        time = System.currentTimeMillis() - time;
        System.out.println("Zatrzymujemy się");
        System.out.println("Przejechał: " + distance());
        distance += distance();


    }

    private long distance() {
        return speed * time / 1000;
    }

    public void drive() {
        if (driveTask != null && driveTask.isAlive()) {
            return;
        }
        driveTask = new Thread(this);
        driveTask.start();
    }

    public int getSpeed() {
        return speed;
    }



    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void stop() throws InterruptedException {
        if (driveTask!=null){
            driveTask.interrupt();
            driveTask.join();
        }
    }
}
