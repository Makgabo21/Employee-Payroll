import java.util.ArrayList;

public class Payroll {

    public static void calculatePayroll(ArrayList<Employee> employees) {

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        double totalPayroll = 0;

        System.out.println("\n===== PAYROLL REPORT =====");

        for (Employee employee : employees) {

            double payroll = employee.calculateSalary();

            totalPayroll += payroll;

            System.out.println("----------------------");
            System.out.println("ID: " + employee.id);
            System.out.println("Name: " + employee.name + " " + employee.surname);

            if (employee instanceof Developer) {
                System.out.println("Position: Developer");
            } else if (employee instanceof Manager) {
                System.out.println("Position: Manager");
            } else if (employee instanceof Intern) {
                System.out.println("Position: Intern");
            } else {
                System.out.println("Position: Employee");
            }

            System.out.printf("Payroll: R%.2f%n", payroll);
        }

        System.out.println("----------------------");
        System.out.printf("Total Payroll: R%.2f%n", totalPayroll);
    }
}