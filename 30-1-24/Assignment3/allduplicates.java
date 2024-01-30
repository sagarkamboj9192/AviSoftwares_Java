import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class allduplicates
{
    public static void main(String[] args)
    {
        
        Scanner obj = new Scanner(System.in);
        int k=obj.nextInt();
        for(int l=1;l<=k;l++)
        {
            System.out.print("Enter n: ");
            int n=obj.nextInt();

            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=obj.nextInt();
            }

            HashMap<Integer,Integer> mp  = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
            }

            ArrayList<Integer> ans = new ArrayList<>();
            
            for(int i:mp.keySet())
            {
                int j=mp.get(i);
                if(j> 1){
                    ans.add(i);
                }
            }

            for(int i: ans){
                System.out.print(i+" ");
            }
        }
        
        obj.close();

    }
}