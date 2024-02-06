import java.util.Scanner;

public class checkrulesofstring {
    boolean rulesofstring(String s, int i)
    {
        if( i == s.length()){
            return true;
        }

        

        if(s.charAt(i) == 'a' && i+1 < s.length()) 
        {
            if( s.charAt(i+1) !='a'){
                if((i+2 <= s.length()) && (s.charAt(i+1) != 'b' || s.charAt(i+2) != 'b')){
                    return false;
                }
            }
        }
        
        if(s.charAt(i) == 'b' && ( i-1 >= 0 && s.charAt(i-1) =='b'))
        {
            if( i+1<s.length() && s.charAt(i+1) != 'a')
            return false;
        }

        return rulesofstring(s, i+1);

    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String s= obj.nextLine();

        checkrulesofstring ob = new checkrulesofstring();
        if(s.charAt(0) != 'a'){
            System.out.println("false");
        }
        else{

            System.out.println(ob.rulesofstring(s, 0));
        }
        obj.close();

    }
}
