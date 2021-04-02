package test2.kolejnyTest;

public class Pracownik implements Comparable {
    private int salary;

    public Pracownik(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Object o) {
        Pracownik o1 = (Pracownik) o;
        if (this.salary < o1.salary)
            return -1;
        else if (this.salary > o1.salary)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "salary=" + salary +
                '}';
    }
}
