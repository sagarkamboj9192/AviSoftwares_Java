import java.util.Scanner;

public class removexfromstr {
    String removex(String s, String ans,int i, char x)
    {
        if(i == s.length()){
            return ans;
        }
        if(s.charAt(i)!= x){
            ans+=s.charAt(i);
        }
        return removex(s, ans, i+1, x);
        
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        removexfromstr ob = new removexfromstr();
        System.out.println(ob.removex(s, "", 0,'x'));

        
    }
}
