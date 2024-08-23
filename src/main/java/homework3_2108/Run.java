package homework3_2108;


public class Run {
    public static void main(String[] args) {
        Developer dev = new Developer("Max", 5000);
        dev.work();
        dev.developed();
        dev.receiveSalary();

        ProjectManager projectManager = new ProjectManager("Steve", 7000);
        projectManager.work();
        projectManager.manageProject();
        projectManager.receiveSalary();

        Secretary sec = new Secretary("Antonie", 3000);
        sec.work();
        sec.organizeMeetings();
        sec.receiveSalary();
    }
}