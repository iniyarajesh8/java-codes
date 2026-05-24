import java.util.Scanner;
public class count {
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
        System.out.println();
        for(int i = 0;i<size;i++){
            int count = 1;
            for(int j=i+1;j<size;j++){
              if(arr[i]==arr[j]){
                count+=1;
              }
            }
            System.out.println(arr[i]+": "+count);
        }
        int dup=0;
        int un=0;
        for(int i = 0;i<size;i++){
            int count = 1;
            
            for(int j=i+1;j<size;j++){
              if(arr[i]==arr[j]){
                count+=1;
              }
            }
            if(count>=2){
                dup+=1;
            }
            else{
                un+=1;
            }
            
        }
        System.out.println("duplicate: "+dup);
        System.out.println("unique: "+(un-dup));
    }
}