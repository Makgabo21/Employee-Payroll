public class Developer extends Employee {

    private double bonus;

    public Developer(String id, String name, String surname,
                     double salary, double bonus) {

        super(id, name, surname, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return salary + bonus;
    }
}
