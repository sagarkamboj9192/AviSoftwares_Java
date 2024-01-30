import java.util.ArrayList;
import java.util.Scanner;

public class quest2 {
    public static void main(String[] args)
    {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=0;i<n;i++){
            ls.add(obj.nextInt());
        }

        int index=0;int i=0;
        ls.set(index++, ls.get(0));
        for(int j=1;j<ls.size();j++)
        {
            if(ls.get(j)!= ls.get(i)){
                ls.set(index++, ls.get(j));
                i++;
            }
        }
        // for(int m:ls){
        //     System.out.print(m+" ");
        // }
        System.out.print(index);
        obj.close();
    }

}
