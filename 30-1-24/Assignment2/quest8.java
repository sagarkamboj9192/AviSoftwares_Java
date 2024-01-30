import java.util.Scanner;

class MergeKarray
{
    int[] merge2arr(int[] arr1, int[] arr2)
    {
        int n1=arr1.length;
        int n2=arr2.length;
        if(n1 == 0 ){
            return arr2;
        }
        if(n2 == 0){
            return arr1;
        }
        int[] ans =new int[n1+n2];
        int i=0;int j=0;int index=0;
        while(i<n1 && j < n2)
        {
            if(arr1[i] < arr2[j]){
                ans[index++]=arr1[i];
                i++;
            }
            else{
                ans[index++]=arr2[j];
                j++;
            }
        }
        while(i< n1){
            ans[index++]=arr1[i];
            i++; 
        }
        while(j < n2){
            ans[index++]=arr2[j];
            j++;
        }
        return ans;
    }
}
public class quest8 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k=obj.nextInt();
        int[][] array= new int[k][];
        for(int i=1;i<=k;i++){

            System.out.println("Enter the size of "+i+" array: ");
            int n=obj.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=obj.nextInt();
            }
            // for(int j=0;j<n;j++){
            //     array[i-1][j] = arr[j];
            // }
            array[i-1]=arr;
        }
        
        MergeKarray mer = new MergeKarray();
        int[] ans =  new int[0];
        for(int i=1;i<=k;i++)
        {
            ans= mer.merge2arr(ans, array[i-1]);
            // for(int j:ans){
            //     System.out.print(j+" ");
            // }
        }
        System.out.println("The Final resulted array is :");
        for(int i:ans){
            System.out.print(i+" ");
        }
        obj.close();
    }
}
