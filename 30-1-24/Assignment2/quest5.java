import java.util.ArrayList;
import java.util.Scanner;

public class quest5 {
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
           

            System.out.print("enter Q : ");
            int q=obj.nextInt();

            for(int k=1;k<=q;k++)
            {
                System.out.print("enter L : ");
                int l=obj.nextInt();

                System.out.print("enter R : ");
                int r=obj.nextInt();

                int sum=0;
                l--;r--;
                while(l<=r){
                    sum=sum+ls.get(l%n);
                    l++;
                }

                System.out.print("The sum is : "+sum);

                System.out.println();

            }

            
        }
        obj.close();
    }
}
