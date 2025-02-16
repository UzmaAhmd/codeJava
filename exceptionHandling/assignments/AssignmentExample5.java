package exceptionsinjava;
//5. Problem:
//Create a flight booking system where a passenger can book a ticket only if:
//1. They are above 18 years old.
//2. They provide a valid passport number (exactly 8 characters).
//3. They have enough balance in their account.
//If any condition fails, throw appropriate custom exceptions:
//• UnderAgeException
//• InvalidPassportException
//• InsufficientBalanceException

import exceptionsinjava.exceptions.InsufficientBalanceException;
import exceptionsinjava.exceptions.InsufficientFundsExceeption;
import exceptionsinjava.exceptions.InvalidAgeException;
import exceptionsinjava.exceptions.InvalidPassportException;

import java.util.Scanner;

public class AssignmentExample5 {

    //Part 1////
    public void validateAge(int age) throws InvalidAgeException{
        if (age<18) {
            throw new InvalidAgeException("Age should be above 18 years ");
        }
    }



    //Part 2/////
    public void validatePassportLength(int passportNum) throws InvalidPassportException {
        int length=String.valueOf(passportNum).length();
        if(length!=8){
            throw new InvalidPassportException("Passport number should be exactly 8 characters long");
        }
    }

    //Part 3////
    public void checkBalance(int balance,int ticketPrice) throws InsufficientBalanceException {
        if(balance<ticketPrice){
            throw new InsufficientBalanceException("Not enough balance in your account to book ticket");
        }
    }

    //To check each passenger
    public void checkPassengerDetails(int pAge, int pPassportNum,int pBalance, int pTicketPrice){
        try{
            validateAge(pAge);
            validatePassportLength(pPassportNum);
            checkBalance(pBalance,pTicketPrice);
            System.out.println("Passenger with passport number : " +pPassportNum+ " is eligible to book ticket");
        }
        catch (InvalidAgeException| InvalidPassportException| InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        AssignmentExample5 passenger=new AssignmentExample5();
        Scanner scanner=new Scanner(System.in );

        System.out.println("enter passenger's age : ");
        int age=scanner.nextInt();

        System.out.println("enter passport number : ");
        int passportNumber=scanner.nextInt();

        System.out.println("Enter Balance in passenger's account : ");
        int balance= scanner.nextInt();

        System.out.println("Enter ticket charge : ");
        int costOfTicket=scanner.nextInt();

        // passenger.checkPassengerDetails(12,11212121,120000,5000);
       // passenger.checkPassengerDetails(19,1121211,120000,5000);
        passenger.checkPassengerDetails(age,passportNumber,balance,costOfTicket);
    }


}
