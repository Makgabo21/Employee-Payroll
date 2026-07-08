import java.util.ArrayList;
import java.util.Scanner;

//public class SearchEmployee {
//    static void main(String[] args) {
//
//
//        public static class SearchEmployee {
//
//            public static void searchEmployee(ArrayList<Employee> employees) {
//
//                Scanner input = new Scanner(System.in);
//
//                System.out.print("Enter employee position (Employee, Developer, Manager, Intern): ");
//
//                boolean found = false;
//
//                for (Employee emp : employees) {
//                    if (emp.getPosition().equalsIgnoreCase(position)) {
//                        System.out.println("Employee ID: " + emp.getId());
//                        System.out.println("Employee Name: " + emp.getName());
//                        System.out.println("Position: " + emp.getPosition());
//                        System.out.println("----------------------");
//                        found = true;
//                    }
//                }
//
//                if (!found) {
//                    System.out.println("No employee found.");
//                }
//            }
//
//            final String position = input.nextLine();
//
//            public static void searchEmployee(ArrayList<Employee> employees) {
//            }
//
//            public static void searchEmployee(ArrayList<Employee> employees) {
//
//            }
//
//            public static void searchEmployee(ArrayList<Employee> employees) {
//            }
//        }
//    }
//}


import java.util.ArrayList;
import java.util.Scanner;

public class SearchEmployee {

    public static void searchEmployee(ArrayList<Employee> employees) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        String searchId = input.nextLine();

        boolean found = false;

        for (Employee emp : employees) {
            if (emp.getId().equalsIgnoreCase(searchId)) {
                System.out.println("Employee ID: " + emp.getId());
                System.out.println("Employee Name: " + emp.getName());
                System.out.println("Employee Surname: " + emp.getSurname());
                System.out.println("Salary: " + emp.calculateSalary());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}