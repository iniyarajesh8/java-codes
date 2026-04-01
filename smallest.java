import java.util.Scanner;
public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int x = sc.nextInt();
        System.out.print("enter 2nd number: ");
        int y = sc.nextInt();
        System.out.print("enter 3rd number: ");
        int z = sc.nextInt();
        if(x<y){
            if(x<z){
                System.out.print(x+" is the smallest number");
            }
        }
        else if(y<x){
            if(y<z){
                System.out.print(y+" is the smallest number");
            }
        }
        else{
            System.out.print(z+" is the smallest number");
        }

    }
}
