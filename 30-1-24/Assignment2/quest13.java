import java.util.Scanner;

class bin_search
{
    int binay(int[] arr, int start , int  end, int target)
    {
        while(start <= end){
            int mid= (start+(end -start)/2);
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return start;
    }
}
public class quest13 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }

        bin_search ob = new bin_search();
        System.out.println("Enter the target element: ");
        int target = obj.nextInt();
        int index = ob.binay(arr, 0, n-1,target);
        System.out.println("Value found at index or inserted at: "+index);
        obj.close();

    }
}
