package collectionframework;

import java.util.LinkedList;
import java.util.List;

public class Example3 {
    public static void main(String[] args)
    {
        LinkedList<Integer> ll1=new LinkedList<>();
        System.out.println("empty linked list:  " +ll1);

        ll1.add(12);
        ll1.add(13);
        ll1.add(14);
        ll1.add(15);
        System.out.println("ll after adding elements:  " +ll1);


        ll1.addFirst(11);
        ll1.addLast(19);
        ll1.add(2,12);
        System.out.println("Array after adding first, last,at index 2:  " +ll1);

        LinkedList ll2=new LinkedList<>(List.of(21,22,23,24,25));
        ll1.addAll(ll2);
        System.out.println("After adding all ll2 to ll1:  "+ll1);

        ll1.addAll(3,ll2);
        System.out.println("Adding ll2 again at indx 3 of ll1:  " +ll1);




}}
