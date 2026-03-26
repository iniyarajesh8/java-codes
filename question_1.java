import java.util.Scanner;
public class question_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a word: ");
        String s = sc.next();
        System.out.println("word is: "+s);

        System.out.print("enter a number: ");
        int i = sc.nextInt();
        System.out.println("number is: "+i);

        System.out.print("enter a decimal number: ");
        float f = sc.nextFloat();
        System.out.print("decimal number is: "+f);
    }
}
