import java.util.ArrayList;
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
public class firstandlastocc
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

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(ob.firstocc(arr, 0, n-1, target));
        ans.add(ob.lastocc(arr, 0, n-1, target));

        for(int i:ans){
            System.out.print(i+" ");
        }
        obj.close();
    }
}