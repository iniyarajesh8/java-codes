import java.util.Scanner;
public class checkdiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter second number: ");
        int b = sc.nextInt();
        for(int x = a;x<b;x++){
            if((x%3==0)&&(x%5!=0)){
                System.out.println(x);
            }
        }
    }
}
