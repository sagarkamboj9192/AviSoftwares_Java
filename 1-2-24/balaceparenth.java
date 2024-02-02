import java.util.Scanner;
import java.util.Stack;

public class balaceparenth
{
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner obj = new Scanner(System.in);
        String s =obj.nextLine();

        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(st.empty()){
                st.add(ch);
            }
            else
            {
                if(ch == ')' && st.peek() == '('){
                    st.pop();
                }
                else{
                    st.add(ch);
                }
            }
        }
        System.out.print(st.size());
        obj.close();
    }
}