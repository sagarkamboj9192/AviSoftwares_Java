import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class pract3 {
    public static void main(String[] args)
    {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=0;i<n;i++){
            ls.add(obj.nextInt());
        }
 
        HashMap<Integer, Integer>  mp = new HashMap<>();
        for(int i=0;i<ls.size();i++)
        {
            mp.put(ls.get(i), mp.getOrDefault(ls.get(i),0)+1);
        }

        for(int i: mp.keySet())
        {
            int a= mp.get(i);
            if(a == 1){
                System.out.println("The unique value is : "+ i);
            }
        }

        obj.close();
    }

}
