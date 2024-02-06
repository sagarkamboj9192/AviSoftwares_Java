import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class reversequeue {
    void insert(Queue<Integer> qu)
    {
        
    }
    void reversequ(Queue<Integer> qu)
    {
        if(qu.isEmpty()){
            return;
        }
        int num = qu.peek();
        qu.remove();
        reversequ(qu);
        
    }
    public static void main(String[] args)
    {
        Queue<Integer> qu = new PriorityQueue<>();
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();

        for(int i=0;i<n;i++)
        {
            qu.add(obj.nextInt());
        }

        reversequeue ob= new reversequeue();
        ob.reversequ(qu);
        obj.close();          
    }
}
