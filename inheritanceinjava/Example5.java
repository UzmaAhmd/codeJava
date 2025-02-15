package inheritanceinjava;

class Shape {
    String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
// Child Class
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

public class Example5 {

        public static void main(String[] args) {
            // Creating a Circle object using no-argument constructor
            Circle c1 = new Circle(5.5);
            c1.color = "Red";
            System.out.println("Circle Details (initialized using no-argument constructor):");
            System.out.println("Color: " + c1.getColor());
            System.out.println("Radius: " + c1.radius);

            // Modifying properties using setters
            c1.setColor("Blue");
            c1.radius = 7.5;
            System.out.println("\nCircle Details after using setters:");
            System.out.println("Color: " + c1.getColor());
            System.out.println("Radius: " + c1.radius);

            // Creating a Circle object using parameterized constructor
            Circle c2 = new Circle("Green", 10.0);
            System.out.println("\nCircle Details (initialized using parameterized constructor):");
            System.out.println("Color: " + c2.getColor());
            System.out.println("Radius: " + c2.radius);

            // Using Shape class reference to create a Circle object
            Shape s1 = new Circle("Yellow", 12.0);
            System.out.println("\nUsing Shape class reference to create a Circle object:");
            System.out.println(s1.toString());
}}
