import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter bill: ");
        int x = sc.nextInt();
        int y = 0;
        int z = 1;
        int res = 0;
        if ((x>1)&&(x<=100)) {
            res=x;
            System.out.print(res);
        }
        else if ((x>100)&&(x<=200)) {
            y = x-100;
            res=(100+(y*2));
            System.out.print(res);
        }
        else {
            z=x%100;
            res=(300+(z*3));
            System.out.print(res);

        }
    }

}
