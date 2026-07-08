public class Manager extends Employee {

    private double bonus;
    private double allowance;

    public Manager(String id, String name, String surname,
                   double salary, double bonus, double allowance) {

        super(id, name, surname, salary);

        this.bonus = bonus;
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return salary + bonus + allowance;
    }
}
