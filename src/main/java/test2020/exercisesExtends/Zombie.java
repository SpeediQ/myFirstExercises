package test2020.exercisesExtends;

public class Zombie extends Monster {
    public Zombie(double moveSpeed, double healthPoint, double power) {
        super(moveSpeed, healthPoint, power);
    }



    @Override
    void atack(Monster monster, Monster target) {
        super.atack(monster, target);
    }

    @Override
    void findWeapon(Weapon weapon) {
        super.findWeapon(weapon);
    }
}
