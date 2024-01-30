import java.util.ArrayList;
import java.util.Scanner;

public class quest3 {
    public static void main(String[] atr)
    {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=0;i<n;i++){
            ls.add(obj.nextInt());
        }

        // int ans=0;
        // for(int i=0;i<n;i++){
        //     ans=ans^ls.get(i);
        // }
        // // System.out.print(ans);
        // for(int i=1;i<n;i++){
        //     ans=ans^i;
        // }
        // System.out.print(ans);


        int dup=0;
        ls.sort(null);
        for(int i=0;i<ls.size()-1;i++)
        {
            if(ls.get(i) == ls.get(i+1)){
                dup=ls.get(i);
            }
        }
        int sum=0;
        for(int i:ls){
            sum+=i;
        }
        sum-=dup;

        int actsum = n * (n+1)/2;
        int mis = actsum - sum;
        System.out.println("The duplicate element is : "+dup);
        System.out.println("The missing element is : "+mis);
        obj.close();
    }
}
