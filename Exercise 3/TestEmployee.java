public class TestEmployee {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 3_000_000, 1, 11, 1993);
        staff[1] = new Employee("Maria Bianchi", 2_500_000, 1, 12, 1991);
        staff[2] = new Employee("Antonio Rossi", 2_000_000, 1, 10, 1989);
        
        for (int i = 0; i <  staff.length; i++) staff[i].raiseSalary(5);
        for (int i = 0; i < staff.length; i++) staff[i].print();
    
        System.out.println("SORTED STAFF");
        Sortable.shell_sort(staff);
        for (Employee employee : staff) {
            employee.print();
        }
    }
}
