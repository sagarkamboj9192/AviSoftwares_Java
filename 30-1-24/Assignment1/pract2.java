import java.util.ArrayList;
import java.util.Scanner;

public class pract2 {
    public static void main(String[] args)
    {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=0;i<n;i++){
            ls.add(obj.nextInt());
        }

        System.out.print("Enter the position from where you want to reverse: ");
        int m=obj.nextInt();
        int j=ls.size()-1;
        int i=m+1;
        while(i< j){
            int temp=ls.get(i);
            ls.set(i, ls.get(j));
            ls.set(j, temp);
            i++;j--;
        }
        System.out.println("After reversing the arraylist we get: ");
        for(int k:ls){
            System.out.print(k+" ");
        }
        
        obj.close();
    }
}
