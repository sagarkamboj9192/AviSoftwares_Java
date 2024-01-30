import java.util.Scanner;
class findsum
{
    int targetsum(int[] arr , int i, int sum, int target)
    {
        if(sum == target && i == arr.length){
            return 1;
        }  
        if(i == arr.length){
            return 0;
        }    
        
        return targetsum(arr, i+1, sum+arr[i], target)+targetsum(arr, i+1, sum-arr[i], target);
    }
}
public class quest15 {
    public static void main(String[] args)
    {
        System.out.print("Enter the size of array: ");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= obj.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = obj.nextInt();

        findsum ob = new findsum();
        int ans = ob.targetsum(arr, 0,0, target);
        System.out.print("The answer is : "+ans);
        obj.close();
    }
}
