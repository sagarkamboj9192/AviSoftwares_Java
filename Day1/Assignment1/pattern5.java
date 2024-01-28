public class pattern5 {
    public static void main(String[] pra){
        int n=5;
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                char ch=(char)('A'+j-1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
