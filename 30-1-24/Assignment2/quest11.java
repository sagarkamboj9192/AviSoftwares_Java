
import java.util.Scanner;

class merge_sort{
    void merge(int[] arr, int left , int mid, int right)
    {
        int left_size = mid - left +1;
        int right_size = right - mid;

        int left_arr[]= new int[left_size];
        int right_arr[] = new int[right_size];

        int index=left;
        for(int i=0;i<left_size;i++){
            left_arr[i] = arr[index++];
        }
        for(int i=0;i<right_size;i++){
            right_arr[i] = arr[index++];
        }

        index=left;
        int index1=0;int index2=0;
        while(index1 < left_size && index2 < right_size){
            if(left_arr[index1] < right_arr[index2]){
                arr[index++]=left_arr[index1++];
            }
            else{
                arr[index++]= right_arr[index2++];
            }
        }
        while(index1 < left_size){
            arr[index++]=left_arr[index1++];
        }
        while(index2< right_size){
            arr[index++]= right_arr[index2++];
        }
    }
    void sort(int[] arr, int left, int right)
    {
        if(left < right){
            int mid = (left +(right-left)/2);
            sort(arr, left, mid);
            sort(arr, mid+1,right);

            merge(arr, left, mid, right);
        }
    }
}

public class quest11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        merge_sort obj = new merge_sort();
        obj.sort(arr, 0, n-1);

        for(int i:arr){
            System.out.print(i+" ");
        }

        sc.close();
        

    }
}
