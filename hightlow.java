import java.util.Scanner;
public class hightlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows and columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[m][m];
        int res1 = 0;
        int res2 = 0;
        int res3 = 0;
        int res4 = 0;

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
                for(int l = j+1;l<m;l++)
                {
                    if(arr[i][j]<arr[i][l]){
                        arr[i][j]=arr[i][l];
                    }
                    else{
                        break;
                    }
                    res1=arr[i][j];
                }   
            }
            System.out.println("row "+(i+1)+" highest: "+res1);
        }


        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<m;j++)
            {
                for(int l = 1;l<m;l++)
                {
                    if(arr[i][j]<arr[i][l]){
                        arr[i][l]=arr[i][j];
                    }
                    else{
                        break;
                    }
                    res2=arr[i][j];
                }   
            }
            System.out.println("row "+(i+1)+" lowest: "+res2);
        }
        for(int j = 0;j<m;j++)
        {
            for(int i = 0;i<m;i++)
            {
                for(int l = 1;l<m;l++)
                {
                    if(arr[j][i]<arr[l][i]){
                        arr[j][i]=arr[l][i];
                    }
                    else{
                        break;
                    }
                    res3=arr[j][i];
                }   
            }
            System.out.println("column "+(j+1)+" highest: "+res3);
        }
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<m;j++)
            {
                for(int l = j+1;l<m;l++)
                {
                    if(arr[j][i]>arr[l][i]){
                        arr[j][i]=arr[l][i];
                    }
                    else{
                        break;
                    }
                    res4=arr[j][i];
                }   
            }
            System.out.println("column "+(i+1)+" lowest: "+res4);
        }
    }
}