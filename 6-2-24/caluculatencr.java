import java.util.Scanner;

public class caluculatencr {

    int ncr(int n, int r)
    {
        if (r > n)
            return 0;
        if (r == 0 || r == n)
            return 1;
        return ncr(n - 1, r - 1) + ncr(n - 1, r);
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.print("Enter the r: ");
        int r = sc.nextInt();

        caluculatencr ob= new caluculatencr();
        System.out.println(ob.ncr(n, r));

        sc.close();
    }
}
