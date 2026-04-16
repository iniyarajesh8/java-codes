import java.util.Scanner;
public class weightedavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first mark: ");
        float m1 = sc.nextFloat();
        System.out.print("enter second mark: ");
        float m2 = sc.nextFloat();
        System.out.print("enter third mark: ");
        float m3 = sc.nextFloat();

        System.out.print("enter first weight: ");
        float w1 = sc.nextFloat();
        System.out.print("enter second weight: ");
        float w2 = sc.nextFloat();
        System.out.print("enter third weight: ");
        float w3 = sc.nextFloat();
        
        float average = ((m1*w1)+(m2*w2)+(m3*w3))/(w1+w2+w3);

        System.out.print("the weighted average is "+average);
    }

}
