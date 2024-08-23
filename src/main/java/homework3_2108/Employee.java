package homework3_2108;


public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Общие методы для всех сотрудников
    public void work() {
        System.out.println(name + " is working as a " + position + ".");
    }

    public void receiveSalary() {
        System.out.println(name + " received a salary of " + salary + ".");
    }


    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, "Manager", salary);
    }


    public void manageTeam() {
        System.out.println(getName() + " Work as manager.");
    }
}

// Класс Developer (разработчики), наследуется от Employee
class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, "Developer", salary);
    }


    public void developed() {
        System.out.println(getName() + " is writing code.");
    }
}

// (секретари), наследуется от Employee
class Secretary extends Employee {
    public Secretary(String name, double salary) {
        super(name, "Secretary", salary);
    }


    public void organizeMeetings() {
        System.out.println(getName() + " organized meetings.");
    }
}




class ProjectManager extends Manager {
    public ProjectManager(String name, double salary) {
        super(name, salary);
    }


    public void manageProject() {
        System.out.println(getName() + " is managing the project.");
    }
}
