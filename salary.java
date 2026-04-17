import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter salary: ");
        int x = sc.nextInt();
        float y = 0f;
        float res = 0f;
        if (x<30000) {
            y=((x*5)/100);
            res = (y+x);
            System.out.print("salary is "+res);
        }
        else if ((x>=30000)&&(x<50000)) {
            y=((x*10)/100);
            res = (y+x);
            System.out.print("salary is "+res);
        }
        else {
            y=((x*20)/100);
            res = (y+x);
            System.out.print("salary is "+res);
        }

    }
}
