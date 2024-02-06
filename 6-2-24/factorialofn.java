import java.util.Scanner;

public class factorialofn {
    int fact(int n)
    {
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);

    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        factorialofn ob = new factorialofn();
        System.out.println("The factorial of n is: "+ob.fact(n));
        obj.close();
        
    }
}
