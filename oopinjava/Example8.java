package oopinjava;

class MyEmployee {
    private int empId;
    private String empName;
    private int departmentId;
    private float salary;

    MyEmployee(){
        System.out.println("Dummy constructor\n");
    }

    public MyEmployee(int empId, String empName, int departmentId, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "MyEmployee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", departmentId=" + departmentId +
                ", salary=" + salary +
                '}';
    }
}

public class Example8 {
    public static void main(String[] args) {
        MyEmployee e1=new MyEmployee();
        System.out.println("\nDummy employee\n" + e1);
        e1.setDepartmentId(11);
        e1.setEmpId(111);
        e1.setSalary(211211.4f);
        e1.setEmpName("Aaa");

        System.out.println("\nAfter setting the value of employee1 using setters:");

        System.out.println(e1);
        System.out.println("Department ID: " +e1.getDepartmentId());
        System.out.println("Employee ID: " + e1.getEmpId());
        System.out.println("Employee name: " + e1.getEmpName());
        System.out.println("Employee salary: " + e1.getSalary());

        MyEmployee e2=new MyEmployee(22,"bbb",222,1121121.5f);
        System.out.println("Setting values of employee 2 using all argument constructor:\n");
        System.out.println(e2);
        System.out.println("Department ID: " +e2.getDepartmentId());
        System.out.println("Employee ID: " + e2.getEmpId());
        System.out.println("Employee name: " + e2.getEmpName());
        System.out.println("Employee salary: " + e2.getSalary());

    }


}
