import java.util.Scanner;
public class reverse {
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
            int x = arr[i]%10;
            arr[i]=((x*10)+(arr[i]/10));
        }
        System.out.print("\n"+"reversed array: "+"\n");
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}