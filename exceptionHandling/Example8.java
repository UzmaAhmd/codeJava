package exceptionsinjava;

import exceptionsinjava.exceptions.StackOverflowException;
import exceptionsinjava.exceptions.StackUnderflowException;

class  Stack<T>{
    public T[] elements;
    int index;

    //constructor
    public Stack(){
    }

    public void init(){
        index=0;
    }


     public void push( T t) throws StackOverflowException{
        if(index>=elements.length){
            throw new StackOverflowException("Stack is full");
        }
        elements[index++]=t;
     }



     public T pop() throws StackUnderflowException {
        if (index==0){
           throw new StackUnderflowException("Stack is empty");
        }
         T element = elements[--index];  // Decrement first, then access

         return element;
     }

//     public T peek(){
//        return elements[index];
//     }

    public T peek() throws StackUnderflowException {
        if (index == 0) {
            throw new StackUnderflowException("Stack is empty");
        }
        return elements[index - 1];  // Access last pushed element
    }

}


public class Example8 {
    public static void main(String[] args) {
        Stack <String> myStack=new Stack<>();
        myStack.elements=new  String[3];

        try {
            myStack.push("Hello");
            myStack.push("HI");
            myStack.push("OK");
            myStack.push("BYE");
            myStack.push("CIAO");
            myStack.push("CIAO");
            myStack.push("BYE");

        }
        catch (StackOverflowException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());

        }
        try{
            System.out.println("top element: " +myStack.peek());
            System.out.println("popped : " +myStack.pop());
            System.out.println("popped : " +myStack.pop());
            System.out.println("popped : " +myStack.pop());
            System.out.println("popped : " +myStack.pop());
            System.out.println("popped : " +myStack.pop());


        }
        catch (StackUnderflowException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

    }


}
