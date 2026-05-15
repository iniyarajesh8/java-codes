import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter amount: ");
        int a = sc.nextInt();
        int b = a%100;
        if(a%100==0){
            System.out.print((a/100)+"notes of 100");
        
        }
        
        else if(a>100){
            System.out.println((a/100)+"notes of 100");
            int c = b/50;
            System.out.println(c+"notes of 50");
            int d=b%50;
            int e=d/20;
            System.out.println(e+"notes of 20");
            int f = d%20;
            int g = f/10;
            System.out.println((g)+"notes of 10");

            
        }
        else{
            int e=b/20;
            System.out.println(e+"notes of 20");
            int f = e%20;
            System.out.println((e/10)+"notes of 10");

        }

    }
    
}
