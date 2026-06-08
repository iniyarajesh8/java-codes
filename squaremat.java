import java.util.Scanner;
public class squaremat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows and columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[m][m];
        int[][] res = new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j = 0;j<m;j++)
            {
                System.out.print("enter elements: ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("original matrix: ");
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<m;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<m;j++)
            {   
                res[i][j]=0;
                for(int l = 0;l<m;l++)
                {
                    res[i][j]+=(arr[i][l]*arr[l][j]);
                }
            }
        }
        System.out.println("squared matrix: ");
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<m;j++)
            {
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
}