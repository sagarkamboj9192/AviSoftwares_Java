import java.util.Scanner;

public class multiplication {
    int multply(int n, int count, int prod)
    {
        if(count == 0){
            return prod;
        }
        
        prod+=n;
        count--;
        return multply(n, count, prod);
    }
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        System.out.print("Enter the first no: ");
        int n1 = obj.nextInt();
        System.out.print("Enter the second no: ");
        int n2 = obj.nextInt();

        multiplication ob = new multiplication();
        if(n1 > n2){
            System.out.println(ob.multply(n1, n2, 0));
        }
        else{
            System.out.println(ob.multply(n2, n1, 0));
        }
        obj.close();

    }
}
