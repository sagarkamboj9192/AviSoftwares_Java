public class problem1 {
    public static void main(String[] args)
    {
        int n=12;
        int i=0;
        int ans=0;
        while(n!=0)
        {
            int bit=n%2;
            ans= (int) (bit * (Math.pow(10,i))) + ans;
            n=n/2;
            i++;
        }

        System.out.println("The binary value is "+ans);
    }
}
