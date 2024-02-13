import java.util.Scanner;

public class consecutdup {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        String ans="";
        int i=0;
        while(i<s.length())
        {
            char ch = s.charAt(i);
            if(i+1 < s.length() && s.charAt(i+1) == ch){
                i++;
                continue;
            }
            i++;
            ans=ans+ch;
        }
        System.out.println(ans);
        obj.close();

    }
}
