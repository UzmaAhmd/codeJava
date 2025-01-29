package collectionframework;

import java.util.TreeSet;

class Student implements Comparable<Student> {
    private int roll;
    private String name;
    private int age;

    //getters,setters,toString and constructors
    public Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
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
        return "\n Student :" +
                "roll number = " + roll +
                ", name= '" + name + '\'' +
                ", age= " + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        //compulsory override because it's the only method in comparable interface

        //also this contains the logic to CREATE a balanced binary tree by comparing value passed with
        // the object's value

            return Integer.compare(this.roll, student.roll);
        }

        //     Alternative code for same functionality as compare() using a  bunch of if else statements:
//        if (this.roll < student.roll) {
//            return Integer.compare(this.roll, student.roll);
//        } else if (this.roll> student.roll) {
//            return Integer.compare(this.roll,student.roll);
//        }
//        else {
//            return 0;
//        }
        }

    public class TreeSetStudent {
        public static void main(String[] args) {
            TreeSet<Student> student1=new TreeSet<>();
            student1.add(new Student(12, "Minu" , 13));
            student1.add(new Student(15, "Tinu" , 13));
            student1.add(new Student(5, "Chinku" , 13));
            student1.add(new Student(2, "Rinku" , 13));

            System.out.println(student1);

        }
}