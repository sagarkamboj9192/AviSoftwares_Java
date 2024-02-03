import java.util.*;
public class search2dmat {
    public int binsea(int[][] arr,int start, int end,  int check, int size, int target)
    {
        if(check == 1 ){
            return 1;
        }
        if(start > end){
            check=0;
            return 0;
        }
        int mid = (start+end)/2;
        int val = arr[mid/size][mid%size];
        if(val  == target){
            check=1;
            return 1;
        }
        else if(val > target){
            end=mid-1;
            return binsea(arr, start, end, check, size, target);
        }
        else{
            start=mid+1;
            return binsea(arr, start, end, check, size, target);
        }
    }
    public static void main(String[] args)
    {
        System.out.print("Enter n: ");
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        System.out.print("Enter m: ");
        int m = obj.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        
        System.out.print("enter the target element: ");
        int target = obj.nextInt();
        search2dmat ob = new search2dmat();
        int check=0;
        check =ob.binsea(arr, 0, (n*m)-1, check, m, target);
        if(check == 1){
            System.out.println("yes");
        }
        else{
            System.out.println("NO");
        }

        // ArrayList<Integer> ans=  new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         ans.add(arr[i][j]);
        //     }
        // }
        // ans.sort(null);
        // int index=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         arr[i][j]=ans.get(index++);
        //     }
        // }

        // boolean check =false;
        // int start=0;int end=(n*m) -1;
        // while(start <= end)
        // {
        //     int mid= (start + end)/2;
        //     int val = arr[mid/m][mid%m];
        //     if(val == target)
        //     {
        //         check=true;
        //         break;
        //     }
        //     else if(val > target){
        //         end=mid-1;
        //     }
        //     else{
        //         start=mid+1;
        //     }
        // }
        // if(check){
        //     System.out.println("yes");
        // }
        // else{
        //     System.out.println("NO");
        // }
    }
}
