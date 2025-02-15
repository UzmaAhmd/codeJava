package inheritanceinjava;
class Device {
    String brand;
    String model;

    // No-argument constructor
    public Device() {
    }

    // Parameterized constructor
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

// Child Class
class Phone extends Device {
    int batteryCapacity;

    // No-argument constructor
    public Phone() {
        super();
    }

    // Parameterized constructor for Phone-specific fields
    public Phone(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    // Parameterized constructor for Device and Phone fields
    public Phone(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }

    // Getters and setters
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}

// Main class to demonstrate functionality
public class Example7 {
    public static void main(String[] args) {
        // Creating a Phone object using no-argument constructor
        Phone p1 = new Phone();
        p1.setBrand("Apple");
        p1.setModel("iPhone 14");
        p1.setBatteryCapacity(3279);
        System.out.println("Phone Details (initialized using no-argument constructor):");
        System.out.println("Brand: " + p1.getBrand());
        System.out.println("Model: " + p1.getModel());
        System.out.println("Battery Capacity: " + p1.getBatteryCapacity() + "mAh");

        // Modifying properties using setters
        p1.setBrand("Samsung");
        p1.setModel("Galaxy S23");
        p1.setBatteryCapacity(3900);
        System.out.println("\nPhone Details after using setters:");
        System.out.println(p1);

        // Creating a Phone object using parameterized constructor
        Phone p2 = new Phone("Google", "Pixel 7", 4355);
        System.out.println("\nPhone Details (initialized using parameterized constructor):");
        System.out.println(p2);

        // Using Device class reference to create a Phone object
        Device d1 = new Phone("OnePlus", "11 Pro", 5000);
        System.out.println("\nUsing Device class reference to create a Phone object:");
        System.out.println(d1.toString());

    }
}
