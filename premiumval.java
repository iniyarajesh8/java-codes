import java.util.Scanner;
public class premiumval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter premium value: ");
        float a = sc.nextFloat();
        System.out.print("enter age: ");
        int age = sc.nextInt();
        if((age>=1)&&(age<=10)){
            float b = ((a*10)/100);
            System.out.print("total premium value: "+(a-b));
        }
        else if((age>=11)&&(age<=20)){
            float b = ((a*15)/100);
            System.out.print("total premium value: "+(a-b));
        }
        else if((age>=21)&&(age<=30)){
            float b = ((a*20)/100);
            System.out.print("total premium value: "+(a-b));
        }
        else if((age>=31)&&(age<=40)){
            float b = ((a*25)/100);
            System.out.print("total premium value: "+(a-b));
        }
        else{
            float b = ((a*30)/100);
            System.out.print("total premium value: "+(a-b));
        }

    }
    
}
