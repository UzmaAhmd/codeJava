package collectionframework;

import java.util.ArrayDeque;
import java.util.List;

/// Collection Assignment-1,  Array Deque q2


public class Example12 {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack=new ArrayDeque<>(List.of(30,31,32));
        System.out.println("Initialised Stack : " +stack);
        stack.push(33);
        stack.push(34);
        System.out.println("After adding elements to stack : " +stack);

        stack.pop();
        stack.pop();
        System.out.println("After deleting first two element of Stack : " +stack);

        System.out.println("Top  element of stack : " +stack.getFirst());


    }
}
