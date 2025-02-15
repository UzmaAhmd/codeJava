package collectionframework;

import java.util.ArrayDeque;

public class Example4 {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        //queue.addFirst(100);
        //queue.addLast(900);
        queue.add(17);
        System.out.println("Array Deque 1 after adding elements:  "+queue);
        int x=queue.remove();
        int y=queue.remove();
        System.out.println("Array Deque 1 after removing elements:  "+queue);

        ArrayDeque<Integer> stack=new ArrayDeque<>();
//        stack.add(22);
//        stack.add(24);
//        stack.add(26);
//        stack.pop();
        stack.push(27);
        stack.addFirst(21);
        stack.addFirst(20);
        stack.push(29);
        stack.pop();











    }
}
