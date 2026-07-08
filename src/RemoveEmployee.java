import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEmployee {

    public static void removeEmployee(ArrayList<Employee> employees) {

        Scanner input = new Scanner(System.in);

        // ================= CHARLOTTE - REMOVE EMPLOYEE START =================

        if (employees.isEmpty()) {
            System.out.println("No employees to remove.");
            return;
        }

        while (true) {

            System.out.print("Enter Employee ID to remove (or type 0 to cancel): ");
            String id = input.nextLine().trim();

            if (id.equals("0")) {
                System.out.println("Remove operation cancelled.");
                return;
            }

            boolean found = false;

            for (int i = 0; i < employees.size(); i++) {

                if (employees.get(i).id.equals(id)) {

                    String employeeName = employees.get(i).name;

                    employees.remove(i);

                    System.out.println("\n" + employeeName + " removed successfully!");

                    found = true;
                    break;
                }
            }

            if (found) {
                return;
            }

            System.out.println("Employee ID not found. Please try again.");
        }

        // ================= CHARLOTTE - REMOVE EMPLOYEE END =================
    }
}