class Employee {
    String name, jobTitle;
    double salary;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    public void performanceReport() {
        System.out.println(jobTitle + " " + name + " performed well.");
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    public void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    public void writeCode() {
        System.out.println(name + " is writing code.");
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    public void debugCode() {
        System.out.println(name + " is debugging code.");
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", "NY", 80000);
        Developer d = new Developer("Bob", "LA", 60000);
        Programmer p = new Programmer("Charlie", "SF", 50000);

        m.performanceReport();
        d.writeCode();
        p.debugCode();

        System.out.println("Manager Bonus: " + m.calculateBonus());
    }
}
