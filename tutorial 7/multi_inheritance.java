import java.util.Scanner;

class Students {
    String name;
    int rollNo;
    String course;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class StudentAccount extends Students {
    double collegeFee;

    void displayAccount() {
        System.out.println("College Fee: " + collegeFee);
    }
}

class Hosteller extends StudentAccount {
    double hostelFee;
    double messFee;

    void setDetails(Scanner sc) {
        System.out.println("Enter Hosteller's Name:");
        name = sc.nextLine();

        System.out.println("Enter Roll No:");
        rollNo = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.println("Enter Course:");
        course = sc.nextLine();

        System.out.println("Enter College Fee:");
        collegeFee = sc.nextDouble();

        System.out.println("Enter Hostel Fee:");
        hostelFee = sc.nextDouble();

        System.out.println("Enter Mess Fee:");
        messFee = sc.nextDouble();
        sc.nextLine();
    }

    void displayAll() {
        System.out.println("- - - HOSTELLER DETAILS - - -");
        displayDetails();
        displayAccount();
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        double totalFee = collegeFee + hostelFee + messFee;
        System.out.println("Total Fee: " + totalFee);
    }
}

class DayScholar extends StudentAccount {
    double busFee;

    void setDetails(Scanner sc) {
        System.out.println("Enter Day Scholar's Name:");
        name = sc.nextLine();

        System.out.println("Enter Roll No:");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Course:");
        course = sc.nextLine();

        System.out.println("Enter College Fee:");
        collegeFee = sc.nextDouble();

        System.out.println("Enter Bus Fee:");
        busFee = sc.nextDouble();
        sc.nextLine(); 
    }

    void displayAll() {
        System.out.println("- - - DAY SCHOLAR DETAILS - - -");
        displayDetails();
        displayAccount();
        System.out.println("Bus Fee: " + busFee);
        double totalFee = collegeFee + busFee;
        System.out.println("Total Fee: " + totalFee);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hosteller hosteller = new Hosteller();
        hosteller.setDetails(sc);

        System.out.println();

        DayScholar dayScholar = new DayScholar();
        dayScholar.setDetails(sc);

        System.out.println();

        hosteller.displayAll();
        System.out.println();
        dayScholar.displayAll();

    }
}
