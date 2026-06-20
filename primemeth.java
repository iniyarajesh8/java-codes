package test;
import java.util.Scanner;
public class primemeth {
    static void prime(int a,int b)
    {
        for(int i = a;i<=b;i++)
        {
            int flag = 0;
            for(int j = i-1;j>1;j--)
            {
                if((i%j!=0))
                {
                    flag=1;
                }
                else
                {
                    flag = 0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first value: ");
        int x = sc.nextInt();
        System.out.print("enter second value: ");
        int y = sc.nextInt();
        prime(x,y);
    }
}
