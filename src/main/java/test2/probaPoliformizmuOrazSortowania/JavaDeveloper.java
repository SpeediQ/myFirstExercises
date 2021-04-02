package test2.probaPoliformizmuOrazSortowania;

public class JavaDeveloper extends Employee{
    public JavaDeveloper(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    void description() {
        super.description();
    }

    @Override
    void aboutMyWork() {
        System.out.println("Hi, I work as Java Developer and I really like my job. I will be vary rich  in future :)");
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

//    @Override
//    public String toString() {
//        return "JavaDeveloper{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", salary=" + salary +
//                '}';
//    }
}
