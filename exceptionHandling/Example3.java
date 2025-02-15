package exceptionsinjava;

public class Example3 {
    public static void main(String[] args) {

        int a, b, c;
        a = 10;
        b = 0;

        try{
            c=a/b;
            System.out.println("Result: " +c);
        }
        catch (ArithmeticException e){
            System.out.println("You're dividing by 0 " );
            System.out.println(e.getMessage());


        }
    }

}
