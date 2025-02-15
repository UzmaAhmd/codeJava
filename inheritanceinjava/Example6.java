package inheritanceinjava;
//// 6. Building and House
//// Parent Class
//class Building {
//    String address;
//    int floors;
//}
//// Child Class
//class House extends Building {
//    int numberOfRooms;
//}
//public class Example6 {
//}


class Building {
    String address;
    int floors;

    // No-argument constructor
    public Building() {
    }

    // Parameterized constructor
    public Building(String address, int floors) {
        this.address = address;
        this.floors = floors;
    }

    // Getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", floors=" + floors +
                '}';
    }
}

// Child Class
class House extends Building {
    int numberOfRooms;

    // No-argument constructor
    public House() {
        super();
    }

    // Parameterized constructor for House
    public House(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    // Parameterized constructor for House and Building
    public House(String address, int floors, int numberOfRooms) {
        super(address, floors);
        this.numberOfRooms = numberOfRooms;
    }

    // Getters and setters
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", floors=" + floors +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}

// Main class to demonstrate functionality
public class Example6 {
    public static void main(String[] args) {
        // Creating a House object using no-argument constructor
        House h1 = new House();
        h1.setAddress("123 Maple Street");
        h1.setFloors(2);
        h1.setNumberOfRooms(4);
        System.out.println("House Details (initialized using no-argument constructor):");
        System.out.println("Address: " + h1.getAddress());
        System.out.println("Floors: " + h1.getFloors());
        System.out.println("Number of Rooms: " + h1.getNumberOfRooms());

        // Modifying properties using setters
        h1.setAddress("456 Oak Avenue");
        h1.setFloors(3);
        h1.setNumberOfRooms(5);
        System.out.println("\nHouse Details after using setters:");
        System.out.println(h1);

        // Creating a House object using parameterized constructor
        House h2 = new House("789 Pine Road", 1, 2);
        System.out.println("\nHouse Details (initialized using parameterized constructor):");
        System.out.println(h2);

        // Using Building class reference to create a House object
        Building b1 = new House("999 Birch Lane", 4, 6);
        System.out.println("\nUsing Building class reference to create a House object:");
        System.out.println(b1.toString());


    }
}
