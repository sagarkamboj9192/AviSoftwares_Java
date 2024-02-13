import java.util.Scanner;

public class calculatepower {
    int powerof(int n1, int r, int prod){
        if(r == 0){
            return prod;
        }
        if(prod/10 > Integer.MAX_VALUE){
            prod = prod%10000000;
        }
        else{
            prod*=n1;
        }
        return powerof(n1, r-1, prod);

    }
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        System.out.print("Enter the first no: ");
        int n1 = obj.nextInt();
        System.out.print("Enter the power: ");
        int r = obj.nextInt();

        calculatepower ob = new calculatepower();
        System.out.println(ob.powerof(n1, r, 1));
        obj.close();
        
    }
}
