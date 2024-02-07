import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class reversequeue {
    void reversequ(Queue<Integer> qu)
    {
        if(qu.isEmpty()){
            return ;
        }
        int num = qu.peek();
        qu.remove();
        reversequ(qu);
        qu.add(num);
        
    }
    public static void main(String[] args)
    {
        Queue<Integer> qu = new LinkedList<Integer>();
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();

        for(int i=0;i<n;i++)
        {
            qu.add(obj.nextInt());
        }

        reversequeue ob= new reversequeue();
        ob.reversequ(qu);

        System.out.print("After reversing: ");
        while(!qu.isEmpty()){
            System.out.print(qu.peek()+" ");
            qu.remove();
        }
        obj.close();          
    }
}
