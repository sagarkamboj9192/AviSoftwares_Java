import java.util.Scanner;

public class removeconsdup {
    String removecon(String s, String ans,int i, int index)
    {
        if(i == s.length()){
            return ans;
        }
        if(s.charAt(i)!= ans.charAt(index)){
            ans+=s.charAt(i);
            index++;
        }
        return removecon(s, ans, i+1,index);
        
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        removeconsdup ob= new removeconsdup();
        String ans ="";
        ans=ans+s.charAt(0);
        System.out.println(ob.removecon(s, ans, 1,0));

        obj.close();
        
    }
}
