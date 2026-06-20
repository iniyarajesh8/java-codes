package test;
import java.util.Scanner;
public class sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius: ");
        Float r = sc.nextFloat();
        System.out.println("area of spehere is "+(4*3.14*r*r));
        System.out.println("volume of spehere is "+((4/3)*3.14*r*r*r));
        System.out.println("circumference of spehere is "+(2*3.14*r));
    }

}
