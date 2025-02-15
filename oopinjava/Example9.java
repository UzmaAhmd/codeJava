package oopinjava;


class MyOrder {
        int orderId;
        int productId;
        int customerId;
        double totalAmount;

        public MyOrder() {
            System.out.println("Dummy constructor");
        }

        public MyOrder(int orderId, int productId, int customerId, double totalAmount) {
            this.orderId = orderId;
            this.productId = productId;
            this.customerId = customerId;
            this.totalAmount = totalAmount;
        }

        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public int getCustomerId() {
            return customerId;
        }

        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
        }

        @Override
        public String toString() {
            return "MyOrder" +
                    "orderId=" + orderId +
                    ", productId=" + productId +
                    ", customerId=" + customerId +
                    ", totalAmount=" + totalAmount;};


    }
public class Example9 {
    public static void main(String[] args) {

        MyOrder o1 = new MyOrder();
        System.out.println("\nDummy Order\n" + o1);
        o1.setOrderId(111);
        o1.setProductId(1111);
        o1.setCustomerId(11);
        o1.setTotalAmount(250.75);

        System.out.println("\nAfter setting the value of Order1 using setters:");

        System.out.println(o1);
        System.out.println("Order ID: " + o1.getOrderId());
        System.out.println("Product ID: " + o1.getProductId());
        System.out.println("Customer ID: " + o1.getCustomerId());
        System.out.println("Total Amount: " + o1.getTotalAmount());

        MyOrder order2 = new MyOrder(112, 1112, 12, 499.99);
        System.out.println("Setting values of order 2 using all argument constructor:\n");
        System.out.println(order2);
        System.out.println("\nOrder ID: " + order2.getOrderId());
        System.out.println("Product ID: " + order2.getProductId());
        System.out.println("Customer ID: " + order2.getCustomerId());
        System.out.println("Total Amount: " + order2.getTotalAmount());


    }
}
