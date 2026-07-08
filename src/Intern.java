public class Intern extends Employee {

    public Intern(String id, String name, String surname,
                  double salary) {

        super(id, name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
