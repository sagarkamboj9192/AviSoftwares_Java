import java.util.ArrayList;
import java.util.Scanner;

public class quest4 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();

        for(int i=1;i<=m;i++)
        {
            System.out.print("enter N : ");
            int n=obj.nextInt();

            ArrayList<Integer> ls = new ArrayList<Integer>();
            ArrayList<Integer> ans = new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                ls.add(obj.nextInt());
            }

            long prod=1;
            for(int k=0;k<ls.size();k++)
            {
                if(prod* ls.get(k) >= Long.MAX_VALUE){
                    prod = prod % (long)(Math.pow(10, 9)+7);
                }
                else{
                    prod*=ls.get(k);
                }
            }
            // System.out.print(prod);
            for(int l=0;l<ls.size();l++)
            {
                ans.add((int)(prod / ls.get(l)));
            }

            for(int b:ans){
                System.out.print(b+" ");
            }  
        }
        obj.close();
    }
}
