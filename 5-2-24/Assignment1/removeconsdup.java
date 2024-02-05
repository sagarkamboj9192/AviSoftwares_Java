import java.util.Scanner;

public class removeconsdup {
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = obj.nextLine();
        String ans="";
        if(s.length() == 0){
            ans="";
        }
        else
        {
            ans+=s.charAt(0);
            int index=0;
            for(int i=1;i<s.length();i++)
            {
                if(s.charAt(i) != ans.charAt(index)){
                    ans+=s.charAt(i);
                    index++;
                }
            }
        }
        System.out.println(ans);
        obj.close();
    }
}
