public class pattern7 {
    public static void main(String[] pra)
    {
        int n=3;
        for(int i=1;i<=n;i++)
        {
            for(int k=n-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
