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

            if (id.isEmpty()) {
                System.out.println("Employee ID cannot be empty.");
                continue;
            }

            if (!id.matches("\\d+")) {
                System.out.println("No letters or special characters allowed.");
                continue;
            }

            if (id.length() != 4) {
                System.out.println("Employee ID must be exactly 4 digits.");
                continue;
            }

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

            if (!name.matches("[A-Za-z]+")) {
                System.out.println("Name must contain letters only.");
                continue;
            }

            if (name.length() < 3) {
                System.out.println("Name must be at least 3 letters long.");
                continue;
            }

            if (!Character.isUpperCase(name.charAt(0))) {
                System.out.println("The first letter must be uppercase.");
                continue;
            }

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

            if (surname.isEmpty()) {
                System.out.println("Surname cannot be empty.");
                continue;
            }

            if (!surname.matches("[A-Za-z]+")) {
                System.out.println("Surname must contain letters only.");
                continue;
            }

            if (surname.length() < 3) {
                System.out.println("Surname must be at least 3 letters long.");
                continue;
            }

            if (!Character.isUpperCase(surname.charAt(0))) {
                System.out.println("The first letter of the surname must be uppercase.");
                continue;
            }

            if (!surname.substring(1).equals(surname.substring(1).toLowerCase())) {
                System.out.println("The remaining letters of the surname must be lowercase.");
                continue;
            }

            break;
        }

        // ================= SALARY =================

        double salary;

        while (true) {

            System.out.print("Enter Base Salary: ");

            if (input.hasNextDouble()) {

                salary = input.nextDouble();

                if (salary <= 0) {
                    System.out.println("Salary must be greater than 0.");
                    continue;
                }

                break;

            } else {

                System.out.println("Salary must contain numbers only.");
                input.next();
            }
        }

        // ================= EMPLOYEE TYPE =================

        int type;

        while (true) {

            System.out.println("\nSelect Employee Type");
            System.out.println("1. Developer");
            System.out.println("2. Manager");
            System.out.println("3. Intern");
            System.out.print("Choice: ");

            if (!input.hasNextInt()) {
                System.out.println("Numbers only.");
                input.next();
                continue;
            }

            type = input.nextInt();

            if (type >= 1 && type <= 3) {
                break;
            }

            System.out.println("Invalid choice.");
        }

        // ================= CREATE EMPLOYEE =================

        switch (type) {

            case 1:

                System.out.print("Enter Bonus: ");
                double developerBonus = input.nextDouble();

                employees.add(new Developer(id, name, surname, salary, developerBonus));
                break;

            case 2:

                System.out.print("Enter Bonus: ");
                double managerBonus = input.nextDouble();

                System.out.print("Enter Allowance: ");
                double allowance = input.nextDouble();

                employees.add(new Manager(id, name, surname, salary, managerBonus, allowance));
                break;

            case 3:

                employees.add(new Intern(id, name, surname, salary));
                break;
        }

        System.out.println("\nEmployee " + name + " " + surname + " has been added successfully!");    }
}