package test;
import java.util.Scanner;
public class data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter amount to withdraw: ");
        int x = sc.nextInt();
        System.out.print("enter minutes of song: ");
        float y = sc.nextFloat();
        System.out.print(x+" is the amount to withdraw and the minutes of the song is "+y);
    }
}
