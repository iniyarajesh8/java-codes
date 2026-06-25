package test;
import java.util.Scanner;
public class literacy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter population: ");
        int x = sc.nextInt();
        float m = ((x*52)/100);
        float w = ((x*48)/100);

        float tl = ((x*48)/100);

        float ml = ((x*35)/100);
        float ilm = m-ml;

        float wl = tl-ml;
        float ilw = w-wl;
        System.out.println("number of illiterate men: "+ilm);
        System.out.println("number of illiterate women: "+ilw);
    }
}