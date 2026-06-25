package test;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int x = sc.nextInt();
        System.out.print("enter second number: ");
        int y = sc.nextInt();
        int sum = 0;
        for(int i = x;i<=y;i++)
        {
            sum+=i;
        }
        System.out.print("sum of numbers in the given range: "+sum);
    }
}
