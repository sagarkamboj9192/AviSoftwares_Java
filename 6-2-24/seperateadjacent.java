import java.util.Scanner;

public class seperateadjacent
{
    String addadjacent(String s, String ans, int i, int index)
    {
        if(i == s.length()){
            return ans;
        }

        if(s.charAt(i) == ans.charAt(index)){
            ans+='*';
            index++;
        }
        ans+=s.charAt(i);
        index++;

        return addadjacent(s, ans, i+1, index);

    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        seperateadjacent ob = new seperateadjacent();
        String ans="";
        ans+=s.charAt(0);
        System.out.println("The new Strings is: "+ob.addadjacent(s, ans, 1,0));
        obj.close();

    }
}