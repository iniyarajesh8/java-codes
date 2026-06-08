import java.util.Scanner;
public class searchsub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = sc.nextLine();
        System.out.print("enter substring: ");
        String sub = sc.next();
        char[] arr1 = str.toCharArray();
        char[] arr2 = sub.toCharArray();
        int count1=0;
        int count2=0;
        int flag=1;
        for(char c:arr1)
        {
            count1++;
        }
        for(char c:arr2)
        {
            count2++;
        }
        for(int i=0;i<count1;i++)
        {
            for(int j=0;j<count2;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    flag=0;
                }
                else{
                    flag=1;
                    
                }
            }
        }
        if(flag==0)
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
