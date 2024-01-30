import java.util.ArrayList;
import java.util.Scanner;

public class quest9 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=obj.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(obj.nextInt());  
        }

        arr.sort(null);
        int lastnum=Integer.MIN_VALUE;
        int count=0;int longest=1;
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)-1 == lastnum){
                count++;
                lastnum=arr.get(i);
            }
            else if(arr.get(i)!= lastnum){
                count=1;
                lastnum=arr.get(i);
            }

            if(count > longest){
                longest=count;
            } 
        }

        System.out.println("Larget sequence is: "+longest);
        obj.close();
    }
}
