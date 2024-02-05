import java.util.Scanner;

public class countdigits {
    int countd(int n, int count)
    {
        if(n <=0 ){
            return count;
        }

        n=n/10;
        count++;
        return countd(n, count);
        
        
    }
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=obj.nextInt();
        
        countdigits ob = new countdigits();

        System.out.println(ob.countd(n, 0));

        
    }
}
