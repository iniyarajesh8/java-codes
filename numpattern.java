package test;
import java.util.Scanner;
public class numpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int x = sc.nextInt();
        for(int i = 1;i<=x;i++)
        {
            for(int j = x;j>=0+i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}