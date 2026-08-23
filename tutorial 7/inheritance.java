import java.util.Scanner;

class employee {
    String name;
    String address;
    int age;
    long mob; 
    float sal;

    void print_Salary() {
        System.out.println("Salary: " + sal);
    }
}

class officer extends employee {
    String spl;

    void print_Specialization() {
        System.out.println("Specialization: " + spl);
    }
}

class manager extends employee {
    String dep;

    void print_Dept() {
        System.out.println("Department: " + dep);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        officer off = new officer();
        System.out.println("Enter Officer's Name:");
        off.name = sc.nextLine();

        System.out.println("Enter Address:");
        off.address = sc.nextLine();

        System.out.println("Enter Age:");
        off.age = sc.nextInt();

        System.out.println("Enter Mobile:");
        off.mob = sc.nextLong();

        System.out.println("Enter Salary:");
        off.sal = sc.nextFloat();
        sc.nextLine(); // Clear newline buffer

        System.out.println("Enter Specialization:");
        off.spl = sc.nextLine();

        System.out.println();

        manager mgr = new manager();
        System.out.println("Enter Manager's Name:");
        mgr.name = sc.nextLine();

        System.out.println("Enter Address:");
        mgr.address = sc.nextLine();

        System.out.println("Enter Age:");
        mgr.age = sc.nextInt();

        System.out.println("Enter Mobile:");
        mgr.mob = sc.nextLong();

        System.out.println("Enter Salary:");
        mgr.sal = sc.nextFloat();
        sc.nextLine(); // Clear newline buffer

        System.out.println("Enter Department:");
        mgr.dep = sc.nextLine();

        System.out.println();

        System.out.println("- - - Officer Details - - -");
        System.out.println("Name: " + off.name);
        System.out.println("Address: " + off.address);
        System.out.println("Age: " + off.age);
        System.out.println("Mobile: " + off.mob);
        off.print_Salary();
        off.print_Specialization();

        System.out.println();

        System.out.println("- - - Manager Details - - -");
        System.out.println("Name: " + mgr.name);
        System.out.println("Address: " + mgr.address);
        System.out.println("Age: " + mgr.age);
        System.out.println("Mobile: " + mgr.mob);
        mgr.print_Salary();
        mgr.print_Dept();

    }
}
