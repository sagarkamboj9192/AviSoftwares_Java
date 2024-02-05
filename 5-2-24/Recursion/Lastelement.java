import java.util.Scanner;

public class Lastelement {
    int lastindex(int[] arr, int start,int end,  int target ,int ans)
    {
        if(start>end){
            return ans;
        }
        int mid= (start +end)/2;
        if(arr[mid] == target){
            ans=mid;
            return lastindex(arr, mid+1, end, target, ans);
        }
        else if(arr[mid] > target){
            return lastindex(arr, start, mid-1, target, ans);
        }
        else{
            return lastindex(arr, mid+1, end, target, ans);
        }
    }

    int withoutsort(int[] arr, int start, int end, int target, int ans){
        if(start == end){
            return ans;
        }
        if(arr[start] == target){
            ans=start;
            
        }
        return withoutsort(arr, start+1, end, target, ans);

    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        
        
        System.out.print("Enter the target element: ");
        int x = obj.nextInt();
        Lastelement ob = new Lastelement();

        // Arrays.sort(arr);
        // System.out.println("Value found at index: "+ob.lastindex(arr, 0, n-1, x,-1));

        System.out.println("Value found at index: "+ob.withoutsort(arr, 0, n, x,-1));
        

        obj.close();

    }
}
