package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/// Collection Assignment-1 ArrayList q3


public class Example7 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>(List.of("aaa","bbb","ccc","ddd","eee","fff"));
//        String[] arrayNames= (String[]) names.toArray();

//        for(String element:arrayNames){
//            System.out.println(names);
//        }


        System.out.println("List of names : " +names);
        String[] arrayNames=names.toArray(new String[0]);
        for(String s:arrayNames)
        {
            System.out.println(s);
        }



        System.out.println("Elements accessed using for loop :  ");
        for (int i=0; i< names.size();i++)
        {
            System.out.println(names.get(i));
        }

        System.out.println("Elements accessed using iterator object: ");
        Iterator<String> iterator= names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("Iterating using for each loop");
        for(String list:names)
        {
            System.out.println(list);
        }

        ArrayList<String> names2=new ArrayList<>(List.of("fff","ggg","ccc"));
        System.out.println("List 1 contains all elements of List 2? " +names.containsAll(names2));

        System.out.println("Printing list 1 without any loops" +names);

    }
}
