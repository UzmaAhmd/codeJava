package exceptionsinjava;

import java.io.FileReader;

public class Eexample1 {
    public static void main(String[] args) {


        int[] nums = {2, 4, 6, 8, 10, 12};
//       EXCEPTION 1::::
//        try{
//            System.out.println(nums[10]);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }

        //Exception 2
        try {
            FileReader reader = new FileReader("data.txt");
        }catch (Exception e){
            System.out.println("File Unavailable!!");
        }



        //Exception 3
        String data=null;
        try{
            System.out.println(data.getBytes());
        }
        catch(Exception e){
            System.out.println("Null data");
        }

    }

}
