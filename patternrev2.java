import java.util.Scanner;
public class patternrev2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n value: ");
        int n = sc.nextInt();
        for(int x = 1;x<=n;x++){
            for(int j = n;j>=x;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}