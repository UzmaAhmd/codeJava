package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1=new ArrayList<>(20);

        arrayList1.add(0,11);
        arrayList1.add(0,12);
        System.out.println("Array1: "+arrayList1);

        ArrayList<Integer> arrayList2=new ArrayList<>(List.of(20,21,22,23,29));
        System.out.println("list 2: " +arrayList2);

        arrayList1.addAll(arrayList2);
        System.out.println("list 1 after adding list2: " +arrayList1);

        ArrayList<Integer> arrayList3=new ArrayList<>();

        arrayList3.add(34);
        arrayList3.add(35);
        arrayList3.add(36);
        arrayList3.add(29);
        System.out.println("Array list 3: " +arrayList3);
        arrayList3.removeLast();

        boolean result;
        result=arrayList1.contains(24);
        System.out.println("array list 1 contains 24?"  +result);

        System.out.println("item at pos 5 in list 1 is: " +arrayList1.get(6));

        System.out.println("index of item 23 is list 1 is: " +arrayList1.indexOf(12));
        System.out.println("last index of 29: " +arrayList1.lastIndexOf(29));

        arrayList1.set(5,77);
        System.out.println(arrayList1);

        result=arrayList1.containsAll(arrayList2);
        System.out.println("array list contains all arra list 2?  " +result);


        ArrayList<Integer> num1=new ArrayList<>(List.of(56,57,58,59));
        ArrayList<Integer> num2=new ArrayList<>(List.of(56,57,68,69,70));

        num1.removeAll(num2);
        System.out.println("removing num2 from num1" +num1);

        System.out.println("iterating array list 1 using for loop: ");
        for(int  i=0;i<arrayList1.size(); i++)
        {
            System.out.println(arrayList1.get(i));
        }


        System.out.println("iterating using for each loop");
        for(Integer num:arrayList2)
        {
            System.out.println(num);
        }

        Iterator<Integer> iterator=arrayList1.iterator();
        while (iterator.hasNext())
        {
            Integer num= iterator.next();
            System.out.println(num);
        }

        ListIterator<Integer> listIterator= arrayList1.listIterator();
        while(listIterator.hasNext()){
            System.out.println("NEXT: " +listIterator.next());
        }
        System.out.println("reverse traversing ");
        while (listIterator.hasPrevious())
        {
            System.out.println("previous " +listIterator.previous());
        }

        arrayList2.forEach(number-> System.out.println(number));








    }
}
