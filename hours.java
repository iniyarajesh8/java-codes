import java.util.Scanner;
public class hours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of seconds: ");
        int s = sc.nextInt();

        int x = (s/60);

        int h = (x/60);
        int m = (x%60);
        int se = (s%60);

        System.out.print(h+" hours,"+m+" mins,"+se+" seconds");
    }

}
