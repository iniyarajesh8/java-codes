import java.util.Scanner;
public class question_3 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter true or false: ");
        boolean x = sc.nextBoolean();

        System.out.print("enter true or false: ");
        boolean y = sc.nextBoolean();

        System.out.println(x+" AND "+y+" is "+(x&&y));

        System.out.println(x+" OR "+y+" is "+(x||y));

        System.out.println("NOT "+x+" is: "+(!x));

        System.out.println("NOT "+y+" is: "+(!y));
    }
}
