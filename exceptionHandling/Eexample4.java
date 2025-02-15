package exceptionsinjava;

public class Eexample4 {
    public static void main(String[] args) {


        int A[]={5,6,7,8,9};
        int r;

        try{
            r=A[0]/A[10];
            System.out.println(r);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        // Note:
        // While writing multiple catch blocks the Exception Classes References Should Be
        // Written From Sub-Class To Super Class order if there is hierarchy in between classes.
        // If not written correctly, then super class reference will overshadow all error objects of
        // subclass.



    }
}
