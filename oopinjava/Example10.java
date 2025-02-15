package oopinjava;

class MyCustomer {
    // Data members
    int customerId;
    String customerName;
    long phone;
    int age;

    // No-Args Constructor
    public MyCustomer() {
        System.out.println("Customer Constructor Called");
    }

    // All-Argument Constructor
    public MyCustomer(int customerId, String customerName, long phone, int age) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phone = phone;
        this.age = age;
    }

    // Getters and setters for all fields
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Customer Name: " + this.customerName +
                ", Age: " + this.age +
                ", Phone: " + this.phone +
                ", Customer ID: " + this.customerId;
    }
}

// Example6 Class (Application Starter)
public class Example10 {
    public static void main(String[] args) {
        // Creating a customer object using the no-args constructor
        MyCustomer customer1 = new MyCustomer();
        System.out.println("Dummy Customer: " + customer1);

        // Setting values using setters
        customer1.setCustomerId(1);
        customer1.setCustomerName("Donald Duck");
        customer1.setPhone(0111111132L);
        customer1.setAge(35);

        // Printing updated customer details
        System.out.println("After Setting the Value of Customer customer1:");
        System.out.println(customer1);
        System.out.println("Customer Name: " + customer1.getCustomerName());
        System.out.println("Customer Age: " + customer1.getAge());
        System.out.println("Customer Phone: " + customer1.getPhone());

        // Creating another customer using the parameterized constructor
        MyCustomer customer2 = new MyCustomer(12, "MickeyMouse", 9123450000L, 26);
        System.out.println("Customer Details (customer2):");
        System.out.println(customer2);
        System.out.println("Customer Name: " + customer2.getCustomerName());
        System.out.println("Customer Age: " + customer2.getAge());
        System.out.println("Customer Phone: " + customer2.getPhone());
    }
}
