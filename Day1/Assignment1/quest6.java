public class quest6 {
    public static void main(String[] pra)
    {
        int n=10400;
        int ans=0;
        while(n!=0)
        {
            int val=n%10;
            ans=ans*10+val;
            n=n/10;
        }
        System.out.println("After reversing the number is: "+ans);
    }
}
