public class question2 {
    
    public static void main(String[] pra)
    {
        int[] arr= {1,2,3,4,5};
        int i=0;
        int j=arr.length-1;
        System.out.println("Before swapping the array :");
        for(int x=0;x<=j;x++)
        {
            System.out.print(arr[x]+" ");
        }
        System.out.println();
        while(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }

        System.out.println("After swapping the array :");
        for(int x=0;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        }

    }
}
