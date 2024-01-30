
import java.util.Scanner;

class firstandlast{
    int firstocc(int[] arr, int start ,int end, int target)
    {
        int ans=-1;
        while(start <= end)
        {
            int mid=(start+(end-start)/2);
            if(arr[mid] == target){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid] > target){
                end=mid-1;
            }
            else{
                start =mid+1;
            }
        }
        return ans;
    }
    int lastocc(int[] arr, int start ,int end, int target)
    {
        int ans=-1;
        while(start <= end)
        {
            int mid=(start+(end-start)/2);
            if(arr[mid] == target){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid] > target){
                end=mid-1;
            }
            else{
                start =mid+1;
            }
        }
        return ans;

    }

}
public class noofocc
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=obj.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = obj.nextInt();

        firstandlast ob = new firstandlast();

        
        int a = ob.firstocc(arr, 0, n-1, target);
        int b = ob.lastocc(arr, 0, n-1, target);

        System.out.println("The no of occurence is : "+ (b-a+1));
        obj.close();
    }
}