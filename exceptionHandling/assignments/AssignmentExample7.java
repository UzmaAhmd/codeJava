//7. 💎 Problem Statement:
//Create a Library Management System that allows users to borrow and return books. The system
//should:
//1. Maintain a collection (HashMap) of books with their availability status.
//2. Allow users to borrow books (if available) and mark them as borrowed.
//3. Allow users to return books, updating their status.
//4. Implement custom exceptions for error handling:
//• BookNotAvailableException: If a book is not available for borrowing.
//• BookAlreadyReturnedException: If a book is returned that was not borrowed.
//• InvalidBookException: If the requested book does not exist in the library.
//Expected Output: Available Books: [Java Programming, Data Structures, AI Basics, Python Crash Course]
//User borrows: Java Programming
//Success! You have borrowed 'Java Programming'.
//User borrows: Java Programming
//Error: 'Java Programming' is currently unavailable.
//User returns: Java Programming
//Success! You have returned 'Java Programming'.
//User returns: Java Programming
//Error: 'Java Programming' was not borrowed.


package exceptionsinjava;
import exceptionsinjava.exceptions.BookAlreadyReturnedException;
import exceptionsinjava.exceptions.BookNotAvailableException;
import exceptionsinjava.exceptions.InvalidBookException;

import java.nio.channels.ScatteringByteChannel;
import java.util.HashMap;
import java.util.Scanner;

class LibraryManagementSystem {

    //declare outside the function so as to give all methods visibility
    private HashMap<String, Boolean> books;


    /// /1. Maintain a collection (HashMap) of books with their availability status.
    ///
    /// function definition inside the constructor
    public LibraryManagementSystem() {
        books = new HashMap<>();
        books.put("Java Programming", true);
        books.put("Data Structures", true);
        books.put("AI Basics", true);
        books.put("Python Crash Course", true);
        System.out.println("Available books : " + books.keySet());
    }


    //2. Allow users to borrow books (if available) and mark them as borrowed.

    /// //• BookNotAvailableException: If a book is not available for borrowing.
    /// //• InvalidBookException: If the requested book does not exist in the library.
    public void borrowBooks(String bookName) throws BookNotAvailableException, InvalidBookException {
        if (!books.containsKey(bookName)) {
            throw new InvalidBookException("Requested book not present in database ");
        }

        if (!books.get(bookName)) {
            throw new BookNotAvailableException("Book isn't available for issue ");
        }

        books.put(bookName, false);
        System.out.println("You have borrowed book " + bookName);

    }

    //3. Allow users to return books, updating their status.
//• BookAlreadyReturnedException: If a book is returned that was not borrowed.
//• InvalidBookException: If the requested book does not exist in the library.
//
    public void returnBooks(String bookName) throws BookAlreadyReturnedException, InvalidBookException {
        if (!books.containsKey(bookName)) {
            throw new InvalidBookException("Requested book not present in database ");
        }

        if (books.get(bookName)) {
            throw new BookAlreadyReturnedException("Book already returned ");
        }

        books.put(bookName, true);
        System.out.println("You have returned the book ");
    }
}



public class AssignmentExample7 {
    public static void main(String[] args) {

    LibraryManagementSystem bookDatabase=new LibraryManagementSystem();
    Scanner scanner=new Scanner(System.in);



     try
    {
        System.out.println("Enter book to be borrowed ");
        String book = scanner.nextLine();
        System.out.println("User borrows: " + book);
        bookDatabase.borrowBooks(book);
    }
     catch(BookNotAvailableException|InvalidBookException e){
        System.out.println(e.getMessage());
    }


    try{
        System.out.println("Enter book to be returned ");
        String book= scanner.nextLine();
        System.out.println("User returns: " +book);
        bookDatabase.returnBooks(book);

    } catch (BookAlreadyReturnedException | InvalidBookException e)
    {
        System.out.println(e.getMessage());
    }


}}
