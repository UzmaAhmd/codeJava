package exceptionsinjava;

public class Example1{
    public static void main(String[] args) {

        int a = 9;
        int b = 0;
        int c = a / b;  //Exception due to bad input
        //program by default will handle this error by printing the error message and exits the program
        System.out.println(c);

        System.out.println("ENd of program");

    }

}
