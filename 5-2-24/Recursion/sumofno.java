import java.util.Scanner;

public class sumofno {
    int printsum(int[] arr,int i, int sum)
    {
        if( i == arr.length){
            return sum;
        }
        sum+=arr[i];
        return printsum(arr, i+1, sum);


    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }

        sumofno ob = new sumofno();
        System.out.println(ob.printsum(arr,0, 0));


    }
}
