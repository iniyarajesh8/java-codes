import java.util.Scanner;
public class inputnum {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter second number: ");
        int b = sc.nextInt();

        int product1 = ((a+b)*(a+b)*(a+b));
        int product2 = ((a*a*a) + (b*b*b) + (a*a*b) + (a*b*b) + (2*a*a*b) + (2*a*b*b));

        System.out.println("LHS= "+product1);
        System.out.print("RHS= "+product2);

    }
}
