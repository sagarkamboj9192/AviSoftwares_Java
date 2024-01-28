public class problem3 {
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=n-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=i;j<2*i;j++)
            {
                System.out.print(j);
            }
            for(int j=2*i-2;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
