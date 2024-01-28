// import java.util.Vector;

public class ques2 {
    public static void main(String[] pra)
    {
        int start=120;
        int end=200;
        int gap=40;
        int sum=start;
        // Vector<Integer> vec = new Vector<Integer>();

        
        // while(sum <= end)
        // {
        //     vec.add(sum);
        //     sum+=gap;
        // }

        // for(int i=0;i<vec.size();i++)
        // {
        //     int val = vec.get(i);
        //     int ans=(5*(val -32))/9;

        //     System.out.println(val + " "+ ans);
        // }

        
        while(sum <= end)
        {
            int ans=(5*(sum -32))/9;
            System.out.println(sum + " "+ ans);
            sum+=gap;
        }
        
        
    }
}
