import java.util.Scanner;
public class question_4 {
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter first number: ");
    int x = sc.nextInt();
    System.out.print("enter second number: ");
    int y = sc.nextInt();

    System.out.println("pre increment of "+x+" is "+(++x));

    System.out.println("pre increment of "+y+" is "+(++y));

    System.out.println("pre decrement of "+x+" is "+(--x));

    System.out.println("pre decrement of "+y+" is "+(--y));

    x++;

    System.out.println("post increment of "+x+" is "+(x));
    
    y++;

    System.out.println("post increment of "+y+" is "+(y));

    x--;

    System.out.println("post decrement of "+x+" is "+(x));
    
    y--;

    System.out.println("post decrement of "+y+" is "+(y));



    }
}
