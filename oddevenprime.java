import java.util.Scanner;
public class oddevenprime {
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
        int even = 0;
        int odd = 0;
        int prime = 0;
        int flag = 1;
        for(int i = 0;i<size;i++){
            if(arr[i]%2==0){
                even+=1;
            }
            else if(arr[i]%2!=0){
                odd+=1;
            }

        }
        for(int i = 0;i<size;i++){
            for(int count = 2;count<arr[i];count++){
                if(arr[i]%count!=0){
                    flag=0;
                }
            }
        }
        if(flag==0){
            prime+=1;
        }
        System.out.println();
        System.out.println("even: "+even);
        System.out.println("odd: "+odd);
        System.out.println("prime: "+prime);
    }
}