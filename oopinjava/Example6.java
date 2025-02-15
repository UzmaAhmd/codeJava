package oopinjava;


class MyProduct
{
    int productId, category,quantity;
    String productName;

    public MyProduct() {
    }

    public MyProduct(int productId, int category, int quantity, String productName) {
        this.productId = productId;
        this.category = category;
        this.quantity = quantity;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "MyProduct{" +
                "productId=" + productId +
                ", category=" + category +
                ", quantity=" + quantity +
                ", productName='" + productName + '\'' +
                '}';
    }
}
public class Example6 {
    public static void main(String[] args)
    {
       MyProduct p1=new MyProduct();
        System.out.println("Dummy Employee:\n" +p1);

        p1.setCategory(22);
        p1.setProductId(2234);
        p1.setQuantity(2);
        p1.setProductName("Toy");
        System.out.println("\n\nAfter setting values of Product1 :");
//        System.out.println(p1);

        System.out.println("PRODUCT ID: " +p1.getProductId());
        System.out.println("Product category: " +p1.getCategory());
        System.out.println("Product Name: " +p1.getProductName());
        System.out.println("Product Quantity: " +p1.getQuantity());

        System.out.println("\n\nProduct 2 details:");
        MyProduct p2=new MyProduct(4332,22423,5,"jacket");

        System.out.println("PRODUCT ID: " +p2.getProductId());
        System.out.println("Product category: " +p2.getCategory());
        System.out.println("Product Name: " +p2.getProductName());
        System.out.println("Product Quantity: " +p2.getQuantity());


    }
}
