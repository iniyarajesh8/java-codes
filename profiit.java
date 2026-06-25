package test;
import java.util.Scanner;
public class profiit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter profit percentage: ");
        int x = sc.nextInt();
        System.out.print("enter total price: ");
        int y = sc.nextInt();
        float p = ((x*y)/100);
        float tp = p+y;
        float price = (tp/15);
        System.out.print("price of one item: "+price);
    }
}