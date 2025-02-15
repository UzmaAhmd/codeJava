package oopinjava;

class Person{

    String name;
    Integer age;
    Float height;
    Float weight;
    String gender;


    //no argument constructor
    Person(){
        System.out.println("Person Constructor called");
    }
    Person(String name,  Integer age, Float height, Float weight, String gender){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.gender=gender;
    }
    void printPersonDetails(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Height: " +height);
        System.out.println("Weight: " +weight);
        System.out.println("Gender: " +gender);

    }
}
public class Example2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.gender="Male";
        p1.weight=23.4f;
        p1.height=64.5f;
        p1.age=12;
        p1.name="Faazil";
        p1.printPersonDetails();


    }
}