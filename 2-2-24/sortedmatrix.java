import java.util.ArrayList;
import java.util.Scanner;

public class sortedmatrix {
    public static void main(String[] args)
    {
        System.out.print("Enter n: ");
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        ArrayList<Integer> ans=  new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans.add(arr[i][j]);
            }
        }
        ans.sort(null);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        obj.close();
    }
}
