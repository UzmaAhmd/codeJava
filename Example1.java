package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>(List.of("A", "B", "C", "D", "E"));
        Collection<String> c2 = new ArrayList<>(List.of("E", "F", "G", "H"));

        c1.add("X");
        c1.addAll(c2);
        System.out.println("after add and add all from c2 to c1\n" +c1);
        c1.remove("G");
       // c1.removeAll(c2);

        c1.retainAll(c2);

        boolean result=c1.contains("Y");
        result=c1.containsAll(c2);
        int len=c1.size();
        System.out.println(c1);



    }
}
