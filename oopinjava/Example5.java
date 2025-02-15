package oopinjava;

class MyBook{
   private String title, author;
   private long isbn;
   private double price;

    public MyBook(String title, String author, long isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }
    public MyBook()
    {
        System.out.println("default constructor");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MyBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }
}

public class Example5 {
    public static void main(String[] args)
    {
        MyBook b1=new MyBook();
        System.out.println("Default constructor called: \n" +b1);

        b1.setAuthor("Ruskin Bond");
        b1.setTitle("Harry Potter");
        b1.setPrice(675);
        b1.setIsbn(23453);

        System.out.println("\nAfter setting values using setters and getters: \n " +b1);
        MyBook b2= new MyBook("The Jungle Book","Rudyard Kipling",987483,434);
        System.out.println("after all argument constructor:\n "+b2);


    }
}
