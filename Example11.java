package collectionframework;

import java.util.ArrayDeque;

/// Collection Assignment-1,  Array Deque q1

public class Example11 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.addLast(21);
        ad1.addLast(22);
        ad1.addLast(23);
        ad1.addLast(24);
        ad1.addLast(25);
        System.out.println("Elements in Deque : " +ad1);

        ad1.removeFirst();
        ad1.removeFirst();
        System.out.println("Updated deque after removing first 2 elements : "+ad1);

        System.out.println("First element : " +ad1.getFirst());
        System.out.println("Last element : " +ad1.getLast());


    }
}
