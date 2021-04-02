package test2020.exercisesExtends;

public class Skeleton extends Monster {
    @Override
    void atack(Monster monster, Monster target) {
        super.atack(monster, target);
    }

    @Override
    void findWeapon(Weapon weapon) {
        super.findWeapon(weapon);
    }

    Skeleton(double moveSpeed, double healthPoint, double power) {
        super(moveSpeed, healthPoint, power);
    }
}
