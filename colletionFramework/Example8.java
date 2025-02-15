package collectionframework;

import java.util.LinkedList;
import java.util.List;

/// Collection Assignment-1 LinkedList q1

public class Example8 {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>(List.of("aa","bb","cc","dd","ee"));
        System.out.println("Linked list on initialisation: " +names);

        names.add(2,"aabb");
        System.out.println("After adding element at index 2: " +names);

        names.addFirst("aaa");
        System.out.println("After adding element at First index: " +names);

        names.addLast("eee");
        System.out.println("After adding element at Last index: " +names);

        names.remove(4);
        System.out.println("After removing element at index 4: " +names);

        System.out.println("List empty? " +names.isEmpty());

        System.out.println("Size of list:" +names.size());

        System.out.println("List contains element eee?  " +names.contains("eee"));

    }
}
