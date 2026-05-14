import java.util.Scanner;
public class pattern987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n value: ");
        int n = sc.nextInt();
        for(int x = n;x>=1;x--){
            int count = x;
            for(int j = 9;count>=1;j--){
                System.out.print(j);
                count--;
            }
            System.out.println();
        }
    }
    
}