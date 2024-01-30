import java.util.*;
public class pract{
    public static void main(String[] args)
    {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            ls.add(obj.nextInt());
        }

        for(int i : ls){
            sum+=i;
        }
        System.out.print("The sum is : "+sum);
        obj.close();
    }
}