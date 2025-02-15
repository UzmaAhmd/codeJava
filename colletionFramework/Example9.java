package collectionframework;

import java.util.LinkedList;
import java.util.List;

/// Collection Assignment-1 LinkedList q2

public class Example9 {
    public static void main(String[] args) {
        LinkedList<Integer> ListA=new LinkedList<>(List.of(1,2,3,4,5));
        System.out.println("Elements in List A : "+ListA);

        LinkedList<Integer> ListB=new LinkedList<>(List.of(6,7,8,9,10));
        System.out.println("Elements in List B : "+ListB);


        ListA.addAll(ListB);
        System.out.println("Elements in List A after appending List B : " +ListA);

        ListA.addAll(3,ListB);
        System.out.println("Elements in List A after appending List B at pos 3 : "+ListA);

        ListA.removeFirst();
        ListA.removeLast();
        System.out.println("Elements in List A after deleting first and last element : "+ListA );

        LinkedList<Integer> ListC=new LinkedList<>(List.of(11,12,13,14,15));
        ListA.addAll(1,ListC);
        System.out.println("Elements in List A after appending List C : "+ListA);
    }

}
