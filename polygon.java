package test;
import java.util.Scanner;
public class polygon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of sides: ");
        int x = sc.nextInt();
        if(x==3)
        {
            System.out.print("triangle");
        }
        else if(x==4)
        {
            System.out.print("square");
        }
        else if(x==5)
        {
            System.out.print("pentagon");
        }
        else if(x==6)
        {
            System.out.print("hexagon");
        }
        else if(x==7)
        {
            System.out.print("heptagon");
        }
        else if(x==8)
        {
            System.out.print("octagon");
        }
        else if(x==9)
        {
            System.out.print("nanogon");
        }
        else if(x==10)
        {
            System.out.print("decagon");
        }
    }
}
