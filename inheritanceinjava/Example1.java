package inheritanceinjava;

class Animal
{
    // data members
    String name;
    int age;



    public Animal() {
        super();
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // getters and setters
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
    // toString method
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Dog extends Animal
{
    String breed;
    // constructor
    public Dog()
    {
    }
    public Dog(String breed) {
        super();
        this.breed = breed;
    }
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Example1 {
    public static void main(String[] args) {
        Dog bruno = new Dog("GermanShepherd");
        System.out.println("Printing Details : ");
        System.out.println("Age : " + bruno.age);
        System.out.println("Breed : " + bruno.breed);
        System.out.println("Name : " + bruno.name);
        bruno.age = 12;
        System.out.println("Age : " + bruno.age);
        bruno.name = "Bhurru";
        System.out.println("Name : " + bruno.name);



        bruno.setName("Dolly");
        System.out.println("Name : " + bruno.name);
        bruno.setAge(14);
        System.out.println("Age : " + bruno.age);
        System.out.println("Name : " + bruno.getName());
        System.out.println("Age : " + bruno.getAge());
        System.out.println("Breed : " + bruno.getBreed());
// Parent Can Hold The Object Of Child
        Animal animal1 = new Dog("Rani",12,"STREET");
        System.out.println(animal1);
        System.out.println(animal1.getName());
        System.out.println(animal1.getAge());
// functions or methods are called based on object attached to the
// reference variable
// where reference variable decides the visibility of methods
    }
}
