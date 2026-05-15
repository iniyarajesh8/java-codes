import java.util.Scanner;
public class evenloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        for(int x = 1;x<=n;x++){
            if(x%2==0){
                System.out.println(x);
            }
        }
    }
}
