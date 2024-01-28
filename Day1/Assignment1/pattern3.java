public class pattern3 {
    public static void main(String[] pra)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                char ch=(char)('A'+i-1);
                System.out.print(ch);
            }
            
            System.out.println();
        }
        
    }
}
