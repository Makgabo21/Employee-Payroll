import java.util.ArrayList;

public class ViewEmployee {

    public static void viewEmployees(ArrayList<Employee> employees) {

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\n===== EMPLOYEE LIST =====");

        for (Employee employee : employees) {

            System.out.println("----------------------");
            System.out.println("ID: " + employee.id);
            System.out.println("Name: " + employee.name);
            System.out.println("Surname: " + employee.surname);
            System.out.printf("Salary: R%.2f%n", employee.salary);        }
    }
}
