/**
 * Employee
 */
public class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    public Employee(String name, double salary, int hireday, int hiremonth, int hireyear) {
        this.name = name;
        this.salary = salary;
        this.hireday = hireday;
        this.hiremonth = hiremonth;
        this.hireyear = hireyear;
    }

    public int getHireYear() {
        return this.hireyear;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + getHireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent/100;
    }

    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (salary<eb.salary) return -1;
        if (salary>eb.salary) return 1;
        return 0;
    }
}