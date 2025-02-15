package inheritanceinjava;

class Vehicle {
    int speed;
    String color;

    public Vehicle(){
    }

    public Vehicle(String color,int speed){
        this.color=color;
        this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}

class Car extends Vehicle {
    int numberOfDoors;
    public Car(){}
    public Car(int numberOfDoors){
        this.numberOfDoors=numberOfDoors;
    }
    public Car(String color, int speed, int numberOfDoors){
        super();
        this.color=color;
        this.speed=speed;
        this.numberOfDoors=numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}

public class Example3 {

    public static void main(String[] args) {
//        Car c1= new Car();
//        c1.speed=345;
//        c1.color="red";
//        c1.numberOfDoors=4;
//        System.out.println(c1);


        Car c1 = new Car();
        c1.speed = 100;
        c1.color = "Blue";
        c1.numberOfDoors = 4;
        System.out.println("Car Details using no-argument constructor):");
        System.out.println("Speed: " + c1.getSpeed());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Number of Doors: " + c1.getNumberOfDoors());

        System.out.println("\nCar Details after using setters:");
        c1.setSpeed(120);
        c1.setColor("Red");
        c1.setNumberOfDoors(2);
        System.out.println("Speed: " + c1.getSpeed());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Number of Doors: " + c1.getNumberOfDoors());

        // Creating an object of Car using parameterized constructor
        System.out.println("\nCar Details using parameterized constructor:");
        Car c2 = new Car("Black", 150, 4);
        System.out.println("Speed: " + c2.getSpeed());
        System.out.println("Color: " + c2.getColor());
        System.out.println("Number of Doors: " + c2.getNumberOfDoors());

        // Using parent class to create an object of the child class
        Vehicle v1 = new Car("White", 200, 5);
        System.out.println("\nUsing Vehicle class to create a Car object:");
        System.out.println(v1.toString());
        }
}
