import java.util.Scanner;
public class simpleint {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter principle amount: ");
        float p = sc.nextFloat();

        System.out.print("enter number of years: ");
        int n = sc.nextInt();

        System.out.print("enter rate of interest ");
        float r = sc.nextFloat();

        System.out.print("the simple intrest is "+((p*n*r)/100));
    }
}
