import java.util.ArrayList;

public class ViewEmployee {

    public static void viewEmployees(ArrayList<Employee> employees) {

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\n===== EMPLOYEE LIST =====");

        for (Employee employee : employees) {

            String jobTitle;

            if (employee instanceof Developer) {
                jobTitle = "Developer";
            } else if (employee instanceof Manager) {
                jobTitle = "Manager";
            } else {
                jobTitle = "Intern";
            }

            System.out.println("----------------------");
            System.out.println("ID: " + employee.id);
            System.out.println("Name: " + employee.name);
            System.out.println("Surname: " + employee.surname);
            System.out.println("Job Title: " + jobTitle);
            System.out.printf("Base Salary: R%.2f%n", employee.salary);
            System.out.printf("Payroll: R%.2f%n", employee.calculateSalary());
        }
    }
}