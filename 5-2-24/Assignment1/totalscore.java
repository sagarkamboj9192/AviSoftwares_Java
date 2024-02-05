import java.util.Scanner;

public class totalscore {
    int score(int[] arr , int n)
    {
        if(n == 0){
            return 0;
        }

        int total=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2 == 0){
                total+=1;
            }
            else{
                if(arr[i]!= 5){
                    total+=3;
                }
                else{
                    total+=5;
                }
            }
        }
        return total;
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the total length of array: ");
        int n=obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= obj.nextInt();
        }

        totalscore ob = new totalscore();
        System.out.println("The total score is : "+ob.score(arr, n));
        obj.close();

    }
}