package inheritanceinjava;

class Person {
    String name;
    int age;
    public Person(){}
    public  Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
// Child Class
class Student extends Person {
    int rollNumber;
    String grade;

    public Student() {
        super();
    }

    public Student(int rollNumber, String grade) {
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public Student(String name, int age, int rollNumber, String grade) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
}

public class Example4 {
    public static void main(String[] args) {
        // Creating a Student object using no-argument constructor
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.rollNumber = 101;
        s1.grade = "A";
        System.out.println("Student Details (initialized using no-argument constructor):");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Roll Number: " + s1.rollNumber);
        System.out.println("Grade: " + s1.grade);

        // Modifying properties using setters
        s1.setName("Bob");
        s1.setAge(21);
        s1.rollNumber = 102;
        s1.grade = "B";
        System.out.println("\nStudent Details after using setters:");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Roll Number: " + s1.rollNumber);
        System.out.println("Grade: " + s1.grade);

        // Creating a Student object using parameterized constructor
        Student s2 = new Student("Charlie", 22, 103, "A+");
        System.out.println("\nStudent Details (initialized using parameterized constructor):");
        System.out.println("Name: " + s2.getName());
        System.out.println("Age: " + s2.getAge());
        System.out.println("Roll Number: " + s2.rollNumber);
        System.out.println("Grade: " + s2.grade);

        // Using Person class reference to create a Student object
        Person p1 = new Student("Diana", 23, 104, "B+");
        System.out.println("\nUsing Person class reference to create a Student object:");
        System.out.println(p1.toString());
    }

}

