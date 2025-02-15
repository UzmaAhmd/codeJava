package oopinjava;

class MyStudent
{
    private int id;
    private String name;
    private int age;
    private char grade;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public MyStudent(int id, String name, int age, char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public MyStudent()
    {
        System.out.println("Default constructor called!");
    }

    @Override
    public String toString() {
        return "MyStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

public class Example4 {
    public static void main(String[] args)
    {
        MyStudent s1=new MyStudent();
        System.out.println("\nDummy student: \n" +s1);

        s1.setAge(8);
        s1.setGrade('t');
        s1.setId(14);
        s1.setName("Faaz");
        System.out.println("\nAfter setting values using getters and setters:");
        System.out.println(s1);


        System.out.println("\nValues using all arg constructor:  ");
        MyStudent s2=new MyStudent(23,"uzz", 20,'b' );
        System.out.println(s2);
    }

}
