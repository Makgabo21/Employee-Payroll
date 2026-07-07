import java.util.ArrayList;
import java.util.Scanner;

public class AddEmployee {

    public static void addEmployee(ArrayList<Employee> employees) {

        Scanner input = new Scanner(System.in);

        // ================= EMPLOYEE ID =================

        String id;

        while (true) {

            System.out.print("Enter Employee ID (4 digits): ");
            id = input.nextLine().trim();

            // Cannot be empty
            if (id.isEmpty()) {
                System.out.println("Employee ID cannot be empty.");
                continue;
            }

            // Digits only
            if (!id.matches("\\d+")) {
                System.out.println("No letters or special characters allowed.");
                continue;
            }

            // Must be exactly 4 digits
            if (id.length() != 4) {
                System.out.println("Employee ID must be exactly 4 digits.");
                continue;
            }

            // Check if ID already exists
            boolean exists = false;

            for (Employee employee : employees) {
                if (employee.id.equals(id)) {
                    exists = true;
                    break;
                }
            }

            if (exists) {
                System.out.println("Employee ID already exists.");
                continue;
            }

            break;
        }
        // ================= NAME =================

        String name;

        while (true) {

            System.out.print("Enter Name: ");
            name = input.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty.");
                continue;
            }

            // Letters only
            if (!name.matches("[A-Za-z]+")) {
                System.out.println("Name must contain letters only.");
                continue;
            }

            // Minimum 3 letters
            if (name.length() < 3) {
                System.out.println("Name must be at least 3 letters long.");
                continue;
            }

            // First letter uppercase
            if (!Character.isUpperCase(name.charAt(0))) {
                System.out.println("The first letter must be uppercase.");
                continue;
            }

            // Remaining letters lowercase
            if (!name.substring(1).equals(name.substring(1).toLowerCase())) {
                System.out.println("The remaining letters must be lowercase.");
                continue;
            }

            break;
        }

        // ================= SURNAME =================

        String surname;

        while (true) {

            System.out.print("Enter Surname: ");
            surname = input.nextLine().trim();

            // Cannot be empty
            if (surname.isEmpty()) {
                System.out.println("Surname cannot be empty.");
                continue;
            }

            // Letters only
            if (!surname.matches("[A-Za-z]+")) {
                System.out.println("Surname must contain letters only.");
                continue;
            }

            // Minimum 3 letters
            if (surname.length() < 3) {
                System.out.println("Surname must be at least 3 letters long.");
                continue;
            }

            // First letter uppercase
            if (!Character.isUpperCase(surname.charAt(0))) {
                System.out.println("The first letter of the surname must be uppercase.");
                continue;
            }

            // Remaining letters lowercase
            if (!surname.substring(1).equals(surname.substring(1).toLowerCase())) {
                System.out.println("The remaining letters of the surname must be lowercase.");
                continue;
            }

            break;
        }
        // ================= SALARY =================

        double salary;

        while (true) {

            System.out.print("Enter Salary: ");

            if (input.hasNextDouble()) {

                salary = input.nextDouble();

                if (salary <= 0) {
                    System.out.println("Salary must be greater than 0.");
                    continue;
                }

                break;

            } else {

                System.out.println("Salary must contain numbers only.");
                input.next(); // Remove invalid input
            }
        }

        // ================= ADD EMPLOYEE =================

        Employee employee = new Employee(id, name, surname, salary);

        employees.add(employee);

        System.out.println("\nEmployee added successfully!");
    }
}