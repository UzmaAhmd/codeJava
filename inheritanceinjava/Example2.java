package inheritanceinjava;

// 2. Employee and Manager
// Parent Class
class Employee {
    String name;
    double salary;


    public Employee(){
        super();
    }
    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
// Child Class
class Manager extends Employee {
    String department;

    public Manager (){
    }

    public Manager(String department){
        this.department=department;
    }
    public Manager(String department, String name, double salary)
    {
        super(name,salary);
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

    public class Example2 {
    public static void main(String[] args) {
        Manager m1=new Manager("HR");
        System.out.println("Printing Details : ");
        System.out.println("Department:" +m1.department);
        System.out.println("Name:" +m1.name);
        System.out.println("Salary:" +m1.salary);
        m1.name="John";
        m1.salary=121212;
        System.out.println("\nDepartment:" +m1.department);
        System.out.println("Name:" +m1.name);
        System.out.println("Salary:" +m1.salary);

        m1.setDepartment("Testing");
        m1.setName("Mary");
        m1.setSalary(343434);
        System.out.println("Department:" +m1.getDepartment());
        System.out.println("Name:" +m1.getName());
        System.out.println("Salary:" +m1.getSalary());

        Employee e1=new Manager("develop","Shanu",232323);
        System.out.println(e1);
        System.out.println("\nUsing parent class to create objects of child class\nDepartment:" +m1.getDepartment());
        System.out.println("Name:" +m1.getName());
        System.out.println("Salary:" +m1.getSalary());


    }
}

