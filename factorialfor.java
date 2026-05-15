import java.util.Scanner;
public class factorialfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value: ");
        int x = sc.nextInt();
        int b =1;
        for(int a = x;a>=1;--a){
            b*=a;

        }
        System.out.print(b);
    }
}
