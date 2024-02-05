
import java.util.Scanner;

class quicksort{
    int pivotelement(int[] arr, int left ,int right)
    {
        int pivot=arr[left];
        int count=0;
        for(int i=left+1;i<=right;i++)
        {
            if(arr[i] <= pivot){
                count++;
            }
        }

        int pivoindex=left+count;
        int temp=arr[pivoindex];
        arr[pivoindex]=arr[left];
        arr[left]=temp;

        int i=left;
        int j=right;
        while( i< pivoindex  &&  j> pivoindex)
        {
            while (arr[i]<= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if(i<pivoindex && j>pivoindex){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=arr[i];
                i++;
                j--;
            }
        }
        return pivoindex;
        
    }
    void sort(int[] arr, int left, int right)
    {
        if(left < right){
            int pivot= pivotelement(arr, left,right);
            sort(arr, left, pivot-1);
            sort(arr, pivot+1, right);
        }
    }
}

public class Quick_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        quicksort obj = new quicksort();
        obj.sort(arr, 0, n-1);
        System.out.println("After sorting the array: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
        

    }
}
