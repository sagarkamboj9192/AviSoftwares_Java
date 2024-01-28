public class question3 {
    public static void main(String[] pra)
    {
        int n=-12345;
        int count=0;
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        System.out.println("Total no of digits is = "+count);
    }
}
