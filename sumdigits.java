import java.util.Scanner;
public class sumdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 3 digit number: ");
        int x = sc.nextInt();

        int a = (x%10);

        int y = (x/10);
        int b = (y%10);

        int c = (y/10);

        int sum = (a+b+c);

        System.out.print("sum of all digits is "+sum);


    }
}
