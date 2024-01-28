public class problem2 {
    public static void main(String[] arg)
    {
        int n=5;
        for(int i=2;i<=n;i++)
        {
            if( i <=3){
                System.out.print(i+" ");
            }
            else
            {
                boolean check = true;
                for(int j=2;j<=i/2;j++)
                {
                    if(i%j == 0){
                        check=false;
                        break;
                    }
                }
                if(check){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
