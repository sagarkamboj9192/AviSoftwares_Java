import java.util.Scanner;
import java.util.Stack;

public class remvoveadjdup {
    Stack<Character> finddup(Stack<Character> st, int i, String s)
    {
        if( i == s.length())
        {
            return st;
        }

        if(st.empty()){
            st.push(s.charAt(i));
        }
        else{
            if(s.charAt(i) == st.peek())
            {
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        
        return finddup(st, i+1, s);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        remvoveadjdup obj = new remvoveadjdup();
        Stack<Character> st = new Stack<>();
        st = obj.finddup(st, 0,s);

        
        StringBuffer ans = new StringBuffer();
        while(!st.empty()){
            ans.append(st.peek());
            st.pop();
            
        }
        ans.reverse();
        System.out.println(ans);
    }
           
    
}
