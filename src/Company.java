public class Company {
    Manager[] managers;
    Developer[] developers;
    int developersCount=0;
    int managersCount=0;

    public Company(Manager[] managers, Developer[] developers) {
        managers=new Manager[2];
        developers=new Developer[5];
    }

    public void addDevelopers(Developer[] developers){
        if (developersCount<developers.length){
            developers[developersCount++]=developers[5];
        }
        else {
            System.out.println("Error");
        }
    }

    public void addManagers(Manager[] managers){
        if(managersCount<managers.length){
            managers[managersCount++]=managers[2];
        }
        else{
            System.out.println("Error");
        }
    }
}
