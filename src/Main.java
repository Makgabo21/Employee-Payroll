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
            System.out.println("3. Search Employee");
            System.out.println("4. payroll");
            //Charlotte:  remove and exit
            System.out.println("5. Remove Employee");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            // Check that the user entered a number
            if (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
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

                case 3:
                    SearchEmployee.searchEmployee(employees);
                    break;

                case 4:
                    Payroll.calculatePayroll(employees);
                    break;
                // ================= CHARLOTTE - REMOVE EMPLOYEE & EXIT START =================

                case 5:
                    RemoveEmployee.removeEmployee(employees);
                    break;

                case 6:
                    System.out.println("\nThank you for using Employee Payroll System.");
                    input.close();
                    System.exit(0);
                    break;

// ================= CHARLOTTE - REMOVE EMPLOYEE & EXIT END =================

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}