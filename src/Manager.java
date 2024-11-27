public class Manager extends Employee implements Workable{
    double managerFixedBonus;

    public Manager(String name, double salary, double managerFixedBonus) {
        super(name, salary);
        this.managerFixedBonus = managerFixedBonus;
    }


    @Override
    void getSalary() {
        System.out.println(name+ "salary: "+salary +" and fixed bonus: "+ managerFixedBonus);
    }

    @Override
    public void work() {
        System.out.println(name+" managing the team");
    }
}
