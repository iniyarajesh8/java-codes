package test;
import java.util.Scanner;
public class last {
    static String[] create(int n)
    {
        Scanner sc = new Scanner(System.in);
        String a[] = new String[n];
        for(int i = 0;i<n;i++)
        {
            System.out.print("enter element: ");
            a[i]=sc.next();
        }
        return a;
    }
    static void display(String[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    static void last(String[] a,int n)
    {
        int count;
        for(int i = 0;i<n;i++)
        {
            count = 0;
            char ch[] = a[i].toCharArray();
            for(char c:ch)
            {
                count++;
            }
            for(int j=count-1;j>=0;j--)
            {
                char res = ch[j];
                System.out.println(res+" "+count);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size: ");
        int s = sc.nextInt();
        String a[] = create(s);
        display(a,s);
        System.out.println();
        System.out.println("last occurence");
        last(a,s);
    }
}