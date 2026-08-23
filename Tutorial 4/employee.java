import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Employee 1:");
        System.out.print("ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Salary: ");
        double sal1 = sc.nextDouble();

        Employee e1 = new Employee(id1, name1, sal1);

        System.out.println("\nEnter details for Employee 2:");
        System.out.print("ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Salary: ");
        double sal2 = sc.nextDouble();

        Employee e2 = new Employee(id2, name2, sal2);

        System.out.println("\n--- Employee Details ---");
        e1.displayEmployee();
        e2.displayEmployee();

        sc.close();
    }
}

class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Salary: " + salary);
    }
}
