
import java.util.Scanner;

public class quest12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0) {
                if(arr[j] > temp){
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
                j--;
            }
            arr[j+1]=temp;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }

        sc.close();

    }
}
