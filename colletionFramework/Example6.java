package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        ArrayList<Integer> listA= new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> listB=new ArrayList<>(List.of(5,6,7,8,9,10,11,12,13,14,15));
        System.out.println("Elements in Array 1: " +listA);
        System.out.println("Elements in Array 2: " +listB);

        listB.removeAll(listA);
        System.out.println("Elements in Array B after removing array A elements: " +listB);

        listA.addAll(listB);
        System.out.println("Elements in Array A after merging ArrayB elements:  "+listA);

//        boolean result;
//        result=listA.containsAll(listB);
        System.out.println("list A contains all elements of list B?  " +listA.containsAll(listB));

        Iterator<Integer> iterator= listA.iterator();
        System.out.println("elements in list A using iterator object: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("elements in list A using for loop: ");
        for (  int i = 0; i< listA.size();i++){
            System.out.println(listA.get(i));
        }

    }
}
