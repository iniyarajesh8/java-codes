package oops;

public class car {
    String brand;
    String model;
    int year;
    public car(String b,String m,int y)
    {
        this.brand=b;
        this.model=m;
        this.year=y;
    }
    public void displayDetails()
    {
        System.out.println("car brand: "+brand);
        System.out.println("car model: "+model);
        System.out.println("car year: "+year);
    }
    public static void main(String[] args) {
        car obj = new car("toyota","land cruiser",2010);
        obj.displayDetails();
    }
}
