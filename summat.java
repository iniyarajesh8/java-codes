package test;
import java.util.Scanner;
public class summat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("enter number of columns: ");
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
        int sum=0;
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                sum+=mat[i][j];
            }
        }
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                if(i==j)
                {
                    sum-=mat[i][j];
                }
                if((i+j)==(c+1))
                {
                    sum-=mat[i][j];
                }
            }
        }
        System.out.print("sum of thr matrix exculding the diagonals is "+(sum));
    }
}