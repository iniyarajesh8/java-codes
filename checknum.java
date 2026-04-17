import java.util.Scanner;
public class checknum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int x = sc.nextInt();
        if (x%2==0) {
            System.out.print("Even");  
        }
        else if (x%3==0) {
            System.out.print("divisible by 3");
        }
        else if ((x%2==0)&&(x%3==0)) {
            System.out.print("Even and divisible by 3");
        }
        else {
            System.out.print("neither");
        }
    }

}
