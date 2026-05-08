class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise(double percent) {
        monthlySalary += monthlySalary * percent / 100;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Doe", 3000);
        Employee e2 = new Employee("Jane", "Smith", 4000);

        System.out.println("Yearly Salary of " + e1.getFirstName() + ": " + e1.getYearlySalary());
        System.out.println("Yearly Salary of " + e2.getFirstName() + ": " + e2.getYearlySalary());

        e1.giveRaise(10);
        e2.giveRaise(10);

        System.out.println("After 10% raise:");
        System.out.println("Yearly Salary of " + e1.getFirstName() + ": " + e1.getYearlySalary());
        System.out.println("Yearly Salary of " + e2.getFirstName() + ": " + e2.getYearlySalary());
    }
}
