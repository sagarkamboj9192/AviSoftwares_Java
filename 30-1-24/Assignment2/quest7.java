import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class quest7 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();

        for(int i=1;i<=m;i++)
        {
            System.out.print("enter N : ");
            int n=obj.nextInt();
            ArrayList<Integer> ls = new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                ls.add(obj.nextInt());
            }
           
            ArrayList<Integer> ans = new ArrayList<>();


            System.out.print("enter k : ");
            int k=obj.nextInt();
            for(int j=1;j<=k;j++){
                int index=0;
                int larg = Integer.MIN_VALUE;
                for(int l=0;l<ls.size();l++)
                {
                    if(ls.get(l) > larg){
                        larg=ls.get(l);
                        index=l;
                    }
                }
                ans.add(larg);
                ls.set(index, Integer.MIN_VALUE);
            }  
            
            Collections.reverse(ans);
            for(int j:ans){
                System.out.print(j+" ");
            }
            System.out.println();
        }


        obj.close();
    }
}
