import java.util.Scanner;
import java.util.Vector;
class posssub
{
    void subst(String s, int i, String st, Vector<String> ans,int b)
    {
        if( i == s.length()){
            return ;
        }
        if(b == s.length()){
            return;
        }
        st=st+s.charAt(i);
        
        ans.add(st);
        subst(s, i+1, st, ans,b);
        st="";
        subst(s, i+1, st, ans, b+1);

       
    }
}
public class allsubstring {
    public static void main(String[] args)
    {
        System.out.print("Enter the string: ");
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        Vector<String> vec = new Vector<>();

        // for(int i=0;i<s.length();i++)
        // {
        //     String st="";
        //     for(int j=i;j<s.length();j++){
        //         st=st+s.charAt(j);
        //         vec.add(st);
        //     }  
        // }
        
        posssub ob = new posssub();

        String sa="";
        ob.subst(s,0,sa,vec,0);
        System.out.println(vec.size());
        for(String i:vec){
            System.out.print(i+" ");
        }
        obj.close();
    }
}
