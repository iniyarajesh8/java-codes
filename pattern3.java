import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        for(int x = 1;x<=n;x++){
            int k =1;
            while(k<=x){
                if(k%2!=0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                k++;
                
                
            }
            System.out.println();

        }
    }
}
