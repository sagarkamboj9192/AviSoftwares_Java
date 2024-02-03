import java.util.ArrayList;
import java.util.Scanner;

public class printdiagonal {
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = obj.nextInt();

        int[][] arr= new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = obj.nextInt();
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int k=0;k<n;k++)
        {
            int j=k;
            int i=0;
            while(j<n)
            {
                ans.add(arr[i][j]);
                i++;
                j++;
            }
        }

        for(int i:ans){
            System.out.print(i+ " ");
        }

        obj.close();

    }
}
