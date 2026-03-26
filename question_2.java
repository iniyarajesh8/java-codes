import java.util.Scanner;
public class question_2 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter first number: ");
    int x = sc.nextInt();
    System.out.print("enter second number: ");
    int y = sc.nextInt();
    
    System.out.println("sum of both numbers: "+(x+y));

    System.out.println("subtraction of both numbers: "+(x-y));

    System.out.println("multiplication of both numbers: "+(x*y));

    System.out.println("division of both numbers: "+(x/y));

    System.out.println("mod of both numbers: "+(x%y));

    boolean z = x>y;
    System.out.println(x+" > "+y+" is "+z);

    z = x<y;
    System.out.println(x+" < "+y+" is "+z);

    z = x==y;
    System.out.println(x+" = "+y+" is "+z);

    z = x!=y;
    System.out.println(x+" not equal to "+y+" is "+z);

    System.out.println(x+" & "+y+": "+(x&y));

    System.out.println(x+" | "+y+": "+(x|y));

    System.out.println(x+" ^ "+y+": "+(x^y));


  }
}

