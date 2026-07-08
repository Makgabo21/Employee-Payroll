import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        int choice;

        while (true) {

            System.out.println("\n===== EMPLOYEE PAYROLL =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Calculate Payroll");
            System.out.println("5. Remove Employee");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
                input.next();
                continue;
            }

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    AddEmployee.addEmployee(employees);
                    break;

                case 2:
                    ViewEmployee.viewEmployees(employees);
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}