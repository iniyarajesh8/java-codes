import java.util.Scanner;
public class factorialwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value: ");
        int x = sc.nextInt();
        int b =1;
        int a = x;
        while(a>=1){
            b*=a;
            --a;

        }
        System.out.print(b);
    }
}