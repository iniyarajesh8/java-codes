import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size: ");
        int size = sc.nextInt();
        int[]arr = new int[size];
        for(int i = 0;i<size;i++){
            System.out.print("enter element"+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("given array: "+"\n");
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        int flag = 0;
        System.out.println();
        for(int i = 0;i<size;i++){
            for(int j = 1+i;j<size;j++){
                if((arr[i]==arr[j])){
                    System.out.print(arr[i]+"\t");
                }
                else if(arr[j]==arr[i]){
                    System.out.print(arr[j]+"\t");
                }
                else{
                    flag=1;
                }

            }
        }
        if(flag==1){
            System.out.print("no duplicates in the array");
        }
    }
}