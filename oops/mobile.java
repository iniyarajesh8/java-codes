package oops;

public class mobile {
    String brand;
    String model;
    int batteryCapacity;
    public mobile(String b,String m,int ba)
    {
        this.brand=b;
        this.model=m;
        this.batteryCapacity=ba;
    }
    public void displayMobileDetails()
    {
        System.out.println("mobile brand: "+brand);
        System.out.println("mobile model: "+model);
        System.out.println("mobile battery capacity: "+batteryCapacity);
    }
    public static void main(String[] args) {
        mobile m = new mobile("apple","iphone 17",4000);
        m.displayMobileDetails();
    }
}