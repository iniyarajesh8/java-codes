import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter height: ");
        float h = sc.nextFloat();
        System.out.print("enter weight: ");
        float w = sc.nextFloat();
        System.out.print("BMI: "+(w/(h*h)));
    }
    
}
