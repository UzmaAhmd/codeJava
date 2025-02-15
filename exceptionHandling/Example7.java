//3. Problem:
//Create a user-defined exception InvalidAgeException. Write a program that takes a user's age as
//input and throws an exception if the age is less than 18.
//Expected Features:
//• Define a custom exception InvalidAgeException (extends Exception).
//• Use throw to raise the exception and try-catch to handle it

package exceptionsinjava;

import exceptionsinjava.exceptions.InvalidAgeException;

public class Example7{
    public static boolean isEligibleForVoting(int age) throws Exception{
        if(age<0){
            throw new InvalidAgeException("Age Cannot be negative");

        }
        if(age>=18){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        try {
            boolean isEligible=isEligibleForVoting(-123);
            System.out.println(isEligible);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
