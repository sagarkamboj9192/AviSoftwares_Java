import java.util.Scanner;

public class convertintonum {
    int getnum(String s, int i, int ans)
    {
        if(i == s.length()){
            return ans;
        }
        
        int num = s.charAt(i) - '0';

        ans = ans *10+ num;
        return getnum(s, i+1, ans);

    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String s= obj.nextLine();

        convertintonum ob = new convertintonum();
        System.out.println("The number is : "+ob.getnum(s, 0,0));


        obj.close();

    }
}
