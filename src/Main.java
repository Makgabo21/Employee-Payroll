import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        int choice;

        while (true) {

            System.out.println("\n===== EMPLOYEE PAYROLL =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.print("Choice: ");

            // Check that the user entered a number
            if (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter 1 or 2.");
                input.next(); // Remove the invalid input
                continue;
            }

            choice = input.nextInt();
            input.nextLine(); // Clear the newline

            switch (choice) {

                case 1:
                    AddEmployee.addEmployee(employees);
                    break;

                case 2:
                    ViewEmployee.viewEmployees(employees);
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}