import java.util.Scanner;

public class fibonacciseries {
    int fib(int n)
    {   
        if(n == 0 || n == 1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();

        fibonacciseries ob = new fibonacciseries();
        System.out.println("The number we get: "+ob.fib(n));   
        
        obj.close();
    }
}
