import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Manager
 */
public class Manager extends Employee {
    private String secretaryName;

    public Manager(String name, double salary, int hireday, int hiremonth, int hireyear) {
        super(name, salary, hireday, hiremonth, hireyear);
        this.secretaryName = "";
    }

    public Manager(String name, double salary, int hireday, int hiremonth, int hireyear, String secretaryName) {
        super(name, salary, hireday, hiremonth, hireyear);
        this.secretaryName = secretaryName;
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void raiseSalary(double byPercent) {
        // add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - super.getHireYear());
        super.raiseSalary(byPercent + bonus);
    }
}