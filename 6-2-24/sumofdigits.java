import java.util.Scanner;

public class sumofdigits {
    int calculatesum(int n, int sum)
    {
        if(n == 0){
            return sum;
        }
        sum = sum+n%10;
        n=n/10;
        return calculatesum(n, sum);

    }
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();

        sumofdigits ob = new sumofdigits();
        System.out.println("The sum is : "+ob.calculatesum(n,0));

        obj.close();
    }
}
