package test2.probaPoliformizmuOrazSortowania;

public class Trader extends Employee{
    public Trader(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    void aboutMyWork() {
        System.out.println("I am Trader. I buy cheap and sell expensive. It's my job ");
    }

    @Override
    void description() {
        super.description();
    }

//    @Override
//    public int compareTo(Object o) {
//        JavaDeveloper o1 = (JavaDeveloper) o;
//        if (this.salary<o1.salary)
//            return -1;
//        else if (this.salary == o1.salary)
//            return 0;
//        else return 1;
//    }
//
//    @Override
//    public String toString() {
//        return "Trader{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", salary=" + salary +
//                '}';
//    }
}
