public class pattern1 {
    public static void main(String[] pra)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<2*i;j++)
            {
                char ch=(char)('A'+j-1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
