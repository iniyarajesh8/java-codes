import java.util.Scanner;
public class diag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows and columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[m][m];
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
        System.out.println("diagonal values:");
        for(int i = 0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
