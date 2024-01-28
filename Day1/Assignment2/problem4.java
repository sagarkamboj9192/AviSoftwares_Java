public class problem4 {
    public static void main(String[] args)
    {
        int n=7;
        int count=1;
        for(int j=1;j<(n/2)+1;j++)
        {
            for(int k=n/2;k>=j;k--){
                System.out.print(" ");
            }
            int ans=count;
            while (ans!=0) {
                System.out.print("*");
                ans--;
            }
            System.out.println();
            count+=2;   
        }
        for(int j=(n/2)+1;j<=n;j++)
        {
            for(int k=n/2+1;k<j;k++){
                System.out.print(" ");
            }
            int ans=count;
            while (ans!=0) {
                System.out.print("*");
                ans--;
            }
            System.out.println();
            count-=2;
        }
    }
}
