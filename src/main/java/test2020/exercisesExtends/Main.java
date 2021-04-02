package test2020.exercisesExtends;

public class Main {
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie(100, 800, 45);
        Skeleton skeleton1 = new Skeleton(180, 500, 60);
        Bow bow = new Bow(1000);

        zombie1.healthPoint=1600;
        System.out.println(zombie1);

        skeleton1.findWeapon(bow);
        System.out.println(skeleton1);




    }
}
