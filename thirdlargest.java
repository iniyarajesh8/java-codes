import java.util.Scanner;
public class thirdlargest {
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
        for(int i = 0;i<size;i++){
            for(int j = i+1;j<size;j++){
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            
            }
        }
        System.out.println();
        System.out.println("third largest: "+arr[3]);
        System.out.println("second smallest: "+arr[1]);

    }
}