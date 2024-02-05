import java.util.Stack;

public class reversestack {
    void insert(Stack<Integer> st, int temp)
    {
        if(st.empty()){
            st.push(temp);
            return;
        }
        int tem = st.peek();
        st.pop();
        insert(st, temp);
        st.push(tem);


    }
    void reversest(Stack<Integer> st)
    {
        if(st.empty()){
            return;
        }
        
        int temp=st.peek();
        st.pop();
        reversest(st);
        insert(st, temp);
        
    }
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println(st.peek());
        for(int i:st){
            System.out.print(i+" ");
        }
        reversestack ob = new reversestack();
        System.out.println();
        ob.reversest(st);
        for(int i:st){
            System.out.print(i+" ");
        }
    }
}
