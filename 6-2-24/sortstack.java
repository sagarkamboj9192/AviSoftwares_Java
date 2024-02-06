import java.util.Scanner;
import java.util.Stack;

public class sortstack {
    void insert(Stack<Integer> st, int num)
    {
        if(st.empty() || (!st.empty() && st.peek() < num)){
            st.push(num);
            return;
        }

        int n=  st.peek();
        st.pop();
        insert(st, num);

        st.push(n);
    }
    void sortst(Stack<Integer> st)
    {
        if(st.empty()){
            return;
        }

        int num = st.peek();
        st.pop();
        sortst(st);

        insert(st, num);

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of stack: ");
        int n = obj.nextInt();

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(obj.nextInt());
        }

        sortstack ob = new sortstack();
        ob.sortst(st);

        while(!st.empty())
        {
            System.out.print(st.peek()+" ");
            st.pop();
        }
        obj.close();
    }
}
