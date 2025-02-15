package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        ArrayList<Double> ds1=new ArrayList<>(List.of(22.2,23.3,24.4,25.5,26.6));
        ds1.add(2,30.3);
        ds1.remove(4);

        ArrayList<Double> ds2= new ArrayList<>(List.of(32.3,34.4,37.3,10.5));
        ds1.addAll(ds2);
        ds1.set(3,55.5);
        double x=10.5;
        int i=0;
        Iterator<Double> iterator=ds1.iterator();
                while(iterator.hasNext()){
                    if(x==iterator.next())
                    {
                        System.out.println("ELEMENT 10.5 FOUND AT INDEX :" +i  );
                    }
                    i++;
                }

        ds1.indexOf(22.2);
        System.out.println("Elements at List 1: ");

        for(i=0;i<ds1.size();i++)
        {
            System.out.println(ds1.get(i));
        }
    }
}
