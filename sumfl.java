import java.util.Scanner;
public class sumfl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int x = sc.nextInt();
        int m = x;
        int a = m%10;
        while(m>10){
            m/=10;
        } 
        System.out.println("sum of the first and last digits: "+(a+m));

    }

}
