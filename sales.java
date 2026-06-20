package test;
import java.util.Scanner;
public class sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of salesmen(rows): ");
        int r = sc.nextInt();
        System.out.print("enter number of products(columns): ");
        int c = sc.nextInt();
        int [][] mat = new int[r][c];
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                System.out.print("enter element: ");
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("original matrix");
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
        Float sum;
        for(int i = 0;i<r;i++)
        {
            sum=0f;
            for(int j = 0;j<c;j++)
            {
                sum+=mat[i][j];
            }
            System.out.println("total sales of salesman "+(i+1)+" is "+sum);
            System.out.println("average sales of salesman "+(i+1)+" is "+(sum/c));
        }
        System.out.println();
        Float prod;
        for(int i = 0;i<c;i++)
        {
            prod=0f;
            for(int j = 0;j<r;j++)
            {
                prod+=mat[j][i];
            }
            System.out.println("total sales of product "+(i+1)+" is "+prod);
            System.out.println("average sales of product "+(i+1)+" is "+(prod/r));
        }
    }
}
