import java.util.Scanner;
public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter price of shirt: ");
        float shirt = sc.nextFloat();

        System.out.print("enter price of pant: ");
        float pant = sc.nextFloat();

        float x = ((shirt*10)/100);
        float y =((pant*15)/100);

        System.out.println("price for shirt after discount: "+(shirt-x));
        System.out.println("price for pant after discount: "+(pant-y));

        System.out.println("total price: "+((shirt-x)+(pant-y)));
    }

}
