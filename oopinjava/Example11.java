package oopinjava;

class MyLaptop {
    String brand;
    String model;
    int ram;
    double processorSpeed;

    public MyLaptop() {
        System.out.println("dummy cnstructor");
    }

    public MyLaptop(String brand, String model, int ram, double processorSpeed) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.processorSpeed = processorSpeed;
    }

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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    @Override
    public String toString() {
        return "MyLaptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", processorSpeed=" + processorSpeed +
                '}';
    }
}

public class Example11 {
        public static void main(String[] args) {
            // Using default constructor
            MyLaptop laptop1 = new MyLaptop();
            System.out.println("\nDefault laptop configuration:\n" + laptop1);

            // Setting values using setters
            laptop1.setBrand("Dell");
            laptop1.setModel("XPS 15");
            laptop1.setRam(16);
            laptop1.setProcessorSpeed(3.6);

            System.out.println("\nAfter setting values for laptop1 using setters:");
            System.out.println(laptop1);
            System.out.println("Brand: " + laptop1.getBrand());
            System.out.println("Model: " + laptop1.getModel());
            System.out.println("RAM: " + laptop1.getRam() + " GB");
            System.out.println("Processor Speed: " + laptop1.getProcessorSpeed() + " GHz");

            MyLaptop laptop2 = new MyLaptop("Apple", "MacBook Pro", 32, 3.8);
            System.out.println("\nSetting values for laptop2 using all-argument constructor:\n");
            System.out.println(laptop2);
            System.out.println("Brand: " + laptop2.getBrand());
            System.out.println("Model: " + laptop2.getModel());
            System.out.println("RAM: " + laptop2.getRam() + " GB");
            System.out.println("Processor Speed: " + laptop2.getProcessorSpeed() + " GHz");
        }
    }

