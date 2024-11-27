//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee=new Manager("Daniel", 4559.22, 1400);
        Employee employee1=new Manager("Jack", 4500, 1300);
        Employee employee2=new Manager("Jacob", 5555, 2409);

        Employee dev=new Developer("Aysel", 1000);

        employee.work();
        dev.work();






        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}