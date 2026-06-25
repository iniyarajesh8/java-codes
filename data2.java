package test;
import java.util.Scanner;
public class data2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of movie: ");
        float x = sc.nextFloat();
        System.out.print("enter price of book: ");
        float y = sc.nextFloat();
        System.out.println("length of movie in minutes: "+(x*60));
        System.out.println("price of book: ");
    }
}
