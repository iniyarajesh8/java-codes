import java.util.Scanner;
public class question_5 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius: ");
        float r = sc.nextFloat();
        System.out.println("area of sphere: "+(4*3.14*r*r));
        System.out.println("volume of sphere: "+(1.33*3.14*r*r*r));
        System.out.println("circumference of sphere: "+(2*3.14*r));
    }
}
