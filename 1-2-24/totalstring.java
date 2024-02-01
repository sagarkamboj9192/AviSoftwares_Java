import java.util.Scanner;

public class totalstring {
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        
        int c=1;
        // 1 b or c and rest a
        c=c+(2*n);

        // only b and c
        c=c+ n*(n-1);

        // one b and one c and other a 
        c = c+ ((n*(n-1)*(n-2))/2);

        // 2c and rest a
        c = c + n*(n-1)/2;

        System.out.println(c);
        obj.close();
    }
}
