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

    void remove(String s, int i, int j, StringBuilder ans) {
        if (i == j) {
            return;
        }
        if (!ans.isEmpty() && s.charAt(i) == ans.charAt(ans.length() - 1)) {
            if (i < j - 1) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    remove(s, i + 1, j, ans);
                } else {
                    ans.deleteCharAt(ans.length() - 1);
                    remove(s, i + 1, j, ans);
                }
            } else {

                ans.deleteCharAt(ans.length() - 1);
                remove(s, i + 1, j, ans);
            }

        } else {
            ans.append(s.charAt(i));
            remove(s, i + 1, j, ans);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        remvoveadjdup obj = new remvoveadjdup();
        // Stack<Character> st = new Stack<>();
        // st = obj.finddup(st, 0,s);

        
        // StringBuffer ans = new StringBuffer();
        // while(!st.empty()){
        //     ans.append(st.peek());
        //     st.pop();
            
        // }
        // ans.reverse();

        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        obj.remove(s, 1, s.length(), ans);
        System.out.println(ans);
        sc.close();
    }
           
}
