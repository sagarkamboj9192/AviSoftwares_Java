import java.util.Scanner;

public class countzero {
    int countzr(int n, int count)
    {
        if(n == 0){
            return count;
        }
        if(n%10 == 0){
            count++;
        }
        n=n/10;
        return countzr(n, count);

    }
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();

        countzero ob = new countzero();
        System.out.println("The count is : "+ob.countzr(n,0));

        obj.close();
    }
}
