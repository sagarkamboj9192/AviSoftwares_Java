import java.util.Scanner;

public class pract5 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();

        for(int i=1;i<=m;i++)
        {
            System.out.print("enter N : ");
            int n=obj.nextInt();
            System.out.print("enter Q : ");
            int q=obj.nextInt();

            if(q == 1){
                int sum=0;
                for(int j=1;j<=n;j++)
                {
                    sum+=j;
                }
                System.out.println(sum);
            }
            else if(q == 2){
                long prod=1;
                for(int j=1;j<=n;j++)
                {
                    if(prod* j >= Long.MAX_VALUE){
                        prod = prod % (long)(Math.pow(10, 9)+7);
                    }
                    else{
                        prod*=j;
                    }
                }
                System.out.println(prod);
            }
            else{
                System.out.println("Please enter the value of Q in terms of 1 & 2 only..!");
            }
        }
        obj.close();
    }
}
