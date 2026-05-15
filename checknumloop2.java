import java.util.Scanner;
public class checknumloop2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char choice;
        do{System.out.print("enter number: ");
            int n = sc.nextInt();
            int x = n,y= n;
            if(x%2==0){
                System.out.println(x+" is even");
            }
            else{
                System.out.println(x+" is odd");
            }
            if((x%2==0)||(x%3==0)||(x%5==0)||(x%7==0)){
                System.out.println(x+" is not a prime number");
            }
            else{
                System.out.println(x+" is a prime number");
            }
            int arm = 0;
            while(x!=0){
                int a = x%10;
                arm=arm + (a*a*a);
                x/=10;
            }
            if(arm==n){
                System.out.println(n+" is an armstrong number");
            }
            else{
                System.out.println(n+" is not an armstrong number");
            }
            int sum = 0;
            while(y!=0){
                int b = y%10;
                sum=b+(sum*10);
                y/=10;
            }
            if(sum==n){
                System.out.print(n+" is a palindrome");
            }
            else{
                System.out.print(n+" is not a palindrome");
            }
            System.out.println("reverse of "+n+" is "+sum);
            
           
        System.out.print("do you wish to continue(Y/N)");
        choice = sc.next().charAt(0);
        }
        while(choice=='Y');
    }
}