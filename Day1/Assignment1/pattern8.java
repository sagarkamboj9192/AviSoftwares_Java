public class pattern8 {
    public static void main(String[] pra)
    {
        int n=5;
        for(int i=1;i<2*n;i+=2)
        {
            // int count=1;
            for(int j=i;j<2*n;j+=2)
            {
                System.out.print(j);
            }

            for(int k=1;k<i;k+=2){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
