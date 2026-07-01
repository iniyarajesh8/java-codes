package oops;

public class laptop {
    String brand;
    String model;
    double price;
    public laptop(String b,String m,double p)
    {
        this.brand=b;
        this.model=m;
        this.price=p;
    }
    public void showLaptopDetails()
    {
        System.out.println("laptop brand: "+brand);
        System.out.println("laptop brand: "+model);
        System.out.println("laptop brand: "+price);
    }
    public static void main(String[] args) {
        laptop obj = new laptop("microsoft","surface",50000);
        obj.showLaptopDetails();
    }
}
