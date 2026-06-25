package test;
import java.util.Scanner;
public class gross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter basic salary: ");
        int sal = sc.nextInt();
        float al = ((sal*40)/100);
        float re = ((sal*20)/100);
        float gr = al+re+sal;
        System.out.print("gross salary: "+gr);
    }
}
