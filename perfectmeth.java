package test;
import java.util.Scanner;
public class perfectmeth {
    static int[] create(int n)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            System.out.print("enter element: ");
            a[i]=sc.nextInt();
        }
        return a;
    }
    static void display(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    static void perfect(int[] a,int n)
    {
        int sum;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=a[i]-1;j>0;j--)
            {
                if(a[i]%j==0)
                {
                    sum+=j;
                }
            }
            if(sum==a[i])
            {
                System.out.print(a[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size: ");
        int s = sc.nextInt();
        int a[] = create(s);
        display(a,s);
        System.out.println();
        System.out.println("perfect numbers");
        perfect(a,s);
    }
}
