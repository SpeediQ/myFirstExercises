package test2020.exercisesExtends;

class Monster {
     double moveSpeed;
     double healthPoint;
     double power;

    @Override
    public String toString() {
        return "Monster{" +
                "moveSpeed=" + moveSpeed +
                ", healthPoint=" + healthPoint +
                ", power=" + power +
                '}';
    }

    Monster(double moveSpeed, double healthPoint, double power) {
        this.moveSpeed = moveSpeed;
        this.healthPoint = healthPoint;
        this.power = power;
    }

    void atack(Monster monster, Monster target) {
        System.out.println("Potwór " + monster + " atakuje " + target + " z siłą " + power);
    }
    void findWeapon(Weapon weapon){
        this.power += weapon.dmg;
    }
}
