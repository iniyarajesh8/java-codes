import java.util.Scanner;
public class circle {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius: ");
        float r = sc.nextFloat();

        System.out.println("area of circle is: "+(3.14*r*r));

        System.out.print("perimetre of circle is: "+(2*3.14*r));

    }

}
