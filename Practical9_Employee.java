public class Practical9_Employee {
    String name;
    double salary;
    static int employeeCount = 0;

    Practical9_Employee() {
        this("Unknown", 0.0);
    }

    Practical9_Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    static void showCount() {
        System.out.println("Total Employees: " + employeeCount);
    }

    public static void main(String[] args) {
        Practical9_Employee e1 = new Practical9_Employee();
        Practical9_Employee e2 = new Practical9_Employee("Rahul", 30000);
        Practical9_Employee e3 = new Practical9_Employee("Priya", 45000);

        e1.display();
        System.out.println();

        e2.display();
        System.out.println();

        e3.display();
        System.out.println();

        showCount();
    }
}
