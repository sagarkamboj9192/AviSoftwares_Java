import java.util.ArrayList;
import java.util.Scanner;

public class quest6 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();

        for(int i=1;i<=m;i++)
        {
            System.out.print("enter N of first array: ");
            int n=obj.nextInt();
            ArrayList<Integer> ls = new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                ls.add(obj.nextInt());
            }
            System.out.print("enter M of first array: ");
            int f1=obj.nextInt();
            ArrayList<Integer> ls1 = new ArrayList<Integer>();
            for(int j=0;j<f1;j++){
                ls1.add(obj.nextInt());
            }

            ArrayList<Integer> ans = new ArrayList<>();

            int x=ls.size()-1;
            int y=ls1.size()-1;
            int carry=0;

            while(x >=0 && y>=0){
                int sum=ls.get(x)+ls1.get(y)+carry;
                int val=sum%10;
                ans.add(val);
                carry=sum/10;
                x--;
                y--;
            } 
            while(x>=0){
                int sum=ls.get(x)+carry;
                int val=sum%10;
                ans.add(val);
                carry=sum/10;
                x--;
            }
            while(y>=0){
                int sum=ls1.get(y)+carry;
                int val=sum%10;
                ans.add(val);
                carry=sum/10;
                y--;
            }
            if(carry!=0){
                ans.add(carry);
            }

            ans.reversed();
            for(int sh:ans){
                System.out.print(sh+" ");
            }
            System.out.println();            
        }
        obj.close();
    }
}
