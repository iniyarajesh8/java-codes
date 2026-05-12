import java.util.Scanner;
public class sumval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter second number: ");
        int b = sc.nextInt();
        int x = a;
        while(a<b){
            a++;
            x+=a;
        }
        System.out.print("sum of all values within range: "+x);



    }
}
