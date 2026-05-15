import java.util.Scanner;
public class primefactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value: ");
        int n = sc.nextInt();
        int x = n;
        while(x>1){
            if(x%2==0){
                x/=2;
                System.out.println("2");
            }
            else if(x%3==0){
                x/=3;
                System.out.println("3");
            }
            else if(x%5==0){
                x/=5;
                System.out.println("5");
            }
            else if(x%7==0){
                x/=7;
                System.out.println("7");
            }
            else{
                System.out.println(x);
            }
        }
        }
        }
    
    

