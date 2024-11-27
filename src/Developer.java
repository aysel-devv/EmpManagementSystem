public class Developer extends Employee implements Workable{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void getSalary() {
        System.out.println("Developer's fixed salary: "+salary);
    }

    @Override
    public void work() {
        System.out.println(name + " writing code");
    }
}
