public class TestManager {
    public static void main(String[] args) {
        Employee[] managers = new Employee[3];
        managers[0] = new Employee("Antonio Rossi", 3_000_000, 1, 11, 1993);
        managers[1] = new Manager("Maria Bianchi", 2_500_000, 1, 12, 1991);
        managers[2] = new Employee("Antonio Rossi", 2_000_000, 1, 10, 1989);
        
        for (int i = 0; i <  managers.length; i++) managers[i].raiseSalary(5);
        for (int i = 0; i < managers.length; i++) managers[i].print();
    
        System.out.println("SORTED managers");
        Sortable.shell_sort(managers);
        for (Employee employee : managers) {
            employee.print();
        }
    }
}
