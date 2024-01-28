public class problem7 {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                if(j == i){
                    System.out.print("*");
                }
                else{

                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
