package collectionframework;

import java.util.*;

/// Collection Assignment-1,  Priority Queue q1


public class Example13 {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(50);
        minHeap.add(20);
        minHeap.add(5);

        System.out.println("Minheap : " +minHeap);

        System.out.println("Removing highest priority element: " +minHeap.remove());
        int getRoot = minHeap.peek();
        System.out.println("Top Element : " +getRoot);

        Integer nums[] = new Integer[minHeap.size()];
        int index = 0;
        while (!minHeap.isEmpty())
        {
            nums[index++] = minHeap.remove();
        }
        System.out.println("Sorted Array : " + Arrays.deepToString(nums));


    }


}
