class Employee {
    protected int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    protected void showSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    public Manager(int salary) {
        super(salary);
    }

    public void testSubclassAccess() {
        System.out.println("Accessing salary in subclass: " + salary);
        showSalary();
    }
}

public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager(85000);
        mgr.testSubclassAccess();
    }
}
