package exceptionsinjava;
import exceptionsinjava.exceptions.NegativeRadiusException;

public class Example6 {
    public static Double areaOfCircle(Float radius) throws NegativeRadiusException{
        if(radius<=0){
            throw new NegativeRadiusException("This value of radius not allowed!!");
        }
        return Math.PI*Math.pow(radius,2);
    }

    public static void main(String[] args) {
        try {
            Double area=areaOfCircle(87f);
            System.out.println("area of circle : " +area);
        }
        catch (NegativeRadiusException e)
        {
            System.out.println(e.getMessage());
        }
    }


}
