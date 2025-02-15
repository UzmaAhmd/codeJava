package oopinjava;

class MyCar {
    String model;
    String make;
    int year;
    double price;

    public MyCar() {
        System.out.println("Car Constructor Called");
    }

    public MyCar(String model, String make, int year, double price) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

public class Example7 {
        public static void main(String[] args)
        {
            MyCar c1=new MyCar();
            System.out.println( "Dummy car " + c1);
            c1.setMake("Suzuki");
            c1.setModel("Swift");
            c1.setPrice(700000.35);
            c1.setYear(2020);
            System.out.println("\nAfter Setting The value of Car C1 using getters and setters: ");
            System.out.println(c1);
            System.out.println("Car make : " + c1.getMake());
            System.out.println("Car model : " + c1.getModel());
            System.out.println("Car price : " + c1.getPrice());
            System.out.println(("Car :" +c1.getYear()));


            System.out.println("\nAfter Setting The value of Car C2 using all argument constructor : ");
            MyCar c2 = new MyCar("Ritz","Maruti",2013,6000000 );
            System.out.println("Car make : " + c2.getMake());
            System.out.println("Car model : " + c2.getModel());
            System.out.println("Car price : " + c2.getPrice());
            System.out.println(("Car :" +c2.getYear()));
        }
    }

