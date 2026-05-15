import java.util.Scanner;
public class perfectnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        int x = n;
        int sum = 1;
        while(x>1){
            if(x%2==0){
                x/=2;
                sum+=2;
            }
            else if(x%3==0){
                x/=3;
                sum+=3;
                
            }
            else if(x%5==0){
                x/=5;
                sum+=5;
                
            }
            else if(x%7==0){
                x/=7;
                sum+=7;
                
            }
            else{
                sum+=x;
                
            }
        }
        if(sum==n){
            System.out.print("it is a perfect number");
        }
        else{
            System.out.print("it is not a perfect number");
        }


    }
}
    

