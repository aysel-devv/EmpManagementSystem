public abstract class Employee implements Workable {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name=name;
        this.salary=salary;
    }

    abstract void getSalary();
}
