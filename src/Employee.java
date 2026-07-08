public abstract class

Employee {

    protected String id;
    protected String name;
    protected String surname;
    protected double salary;

    public Employee(String id, String name, String surname, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double calculateSalary();
}



