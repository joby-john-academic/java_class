package co2_1;
import java.util.Scanner;

// Parent class Employee
class Employee {
    int empId;
    String name;
    double salary;
    String address;

    // Constructor to initialize data members
    Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

// Child class Teacher inheriting properties from Employee
class Teacher extends Employee {
    String department;
    String subjectsTaught;

    // Constructor to initialize additional data members
    Teacher(int empId, String name, double salary, String address, String department, String subjectsTaught) {
        super(empId, name, salary, address); // Call parent class constructor
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }

    // Method to display all data members
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + subjectsTaught);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of teachers: ");
        int n = scanner.nextInt();
        
        Teacher[] teachers = new Teacher[n]; // Array of objects
        
        // Input details for each teacher
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Teacher " + (i+1) + ":");
            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Subjects Taught: ");
            String subjectsTaught = scanner.nextLine();
            
            teachers[i] = new Teacher(empId, name, salary, address, department, subjectsTaught);
        }
        
        // Display details of all teachers
        System.out.println("\nDetails of Teachers:");
        for (Teacher teacher : teachers) {
            teacher.display();
            System.out.println(); // Blank line for readability
        }
        
        scanner.close();
    }
}
