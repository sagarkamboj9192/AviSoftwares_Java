
import java.util.Arrays;
import java.util.Scanner;

public class multiplystring {
    public static void main(String[] args)
    {
        int b = '3'-'0';
        System.out.println(b);
        System.out.print("Enter the first string: ");
        Scanner obj = new Scanner(System.in);
        String s1=obj.nextLine();
        System.out.print("Enter the second string: ");
        String s2= obj.nextLine();

        int[] arr = new int[s1.length()+s2.length()];
        Arrays.fill(arr, 0);
        int index = arr.length-1;
        
        // int carry=0;
        int temp=arr.length;
        for(int i=s2.length()-1;i>=0;i--)
        {
            index = temp-1;
            System.out.println("The index is : "+index);
            int carry=0;
            for(int j=s1.length()-1;j>=0;j--)
            {
                int val=(s2.charAt(i) - '0' )*(s1.charAt(j)-'0'); 
                val+=carry;
                System.out.println("The carry  is : "+(val+arr[index]));
                
                carry=(val+arr[index])/10;
                
                System.out.println("The carry is : "+carry);
                arr[index]=(arr[index]+val)%10;
                index--;             
            }
            System.out.println(carry);
            if(carry!=0){
                arr[index--]=carry;
            }
            temp--;

        }
        
        int i=0;
        while(i<arr.length)
        {
            if(arr[i] != 0){
                break;
            } 
            i++;
        }

        while(i<arr.length){
            System.out.print(arr[i]);
            i++;
        }
        obj.close();
    }
}
