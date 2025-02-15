package exceptionsinjava;


import java.util.Scanner;

class InvalidUsernameException extends Exception{
    public static final String FAULTY_USERNAME="Username %s is not valid";
    public InvalidUsernameException(String message){
        super(message);
    }
}

public class Example4 {
    public static void readUsername() throws InvalidUsernameException{
        Scanner Input=new Scanner(System.in);

        System.out.println("Enter Username : " );
        String userName= Input.next();

        boolean result=userName.matches(".+[0-9].*[a-z]"); //checks if usernsme begins with a number followed by
        //one or more instances of lowercase alphabets

        if (result) {
            throw new InvalidUsernameException(String.format(InvalidUsernameException.FAULTY_USERNAME, userName));
        }
        }


    public static void main(String[] args) {
        try {
            readUsername();
        }catch (InvalidUsernameException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}
