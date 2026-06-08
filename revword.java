import java.util.Scanner;
public class revword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = sc.nextLine();
        char arr[]=str.toCharArray();
        int count=0;
        
        char temp=' ';
        
        for(char c:arr)
        {
            count++;
        }
        int j = count-1;
        for(int i=0;i<count/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        System.out.print(arr);
    }
}