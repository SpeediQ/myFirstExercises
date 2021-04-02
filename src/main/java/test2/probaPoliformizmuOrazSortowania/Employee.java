package test2.probaPoliformizmuOrazSortowania;

class Employee implements Comparable {
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    void description() {
        System.out.println("Hello, my name is " + this.name + ". I earn " + salary + " a mouth.");
    }

    void aboutMyWork() {

    }


    @Override
    public int compareTo(Object o) {
        Employee o1 = (Employee) o;
        if (this.salary < o1.salary)
            return -1;
        else if (this.salary == o1.salary)
            return 0;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
