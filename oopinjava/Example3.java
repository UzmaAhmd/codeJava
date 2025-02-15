package oopinjava;

class MyTelevision{
    private int channelNumber;
    private int volume;
    private boolean isOn;
    private  String brandName;
    private boolean isAndroid;

    public MyTelevision()
    {
        System.out.println("Default constructor called!");
    }

    public MyTelevision( int channelNumber ,int volume, boolean isOn, String brandName, boolean isAndroid){
        this.channelNumber=channelNumber;
        this.volume=volume;
        this.isOn=isOn;
        this.brandName=brandName;
        this.isAndroid=isAndroid;

    }

    public void printChannelNumber()
    {
        System.out.println("Channel Number :  " +this.channelNumber);
    }

    public void printVolume()
    {
        System.out.println("Volume : " +this.volume);
    }




    public int getChannelNumber()
    {
        return this.channelNumber;
    }
    public void setChannelNumber(int channelNumber)
    {
        this.channelNumber=channelNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isAndroid() {
        return isAndroid;
    }

    public void setAndroid(boolean android) {
        isAndroid = android;
    }

    public String toString()
    {
        return "Channel Number: " + this.channelNumber +
                ", Volume: " + this.volume +
                ", Power: " + (this.isOn ? "On" : "Off") +
                ", Brand: " + this.brandName +
                ", Android: " + (this.isAndroid ? "Yes" : "No");
    }

}
public class Example3 {
    public static void main(String[] args)
    {
        MyTelevision samsungTV= new MyTelevision();
        System.out.println(samsungTV);

        MyTelevision lgTV= new MyTelevision(226,90,true , "lg",true);
        System.out.println(lgTV);
    }

}
