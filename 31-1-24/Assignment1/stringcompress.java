import java.util.Scanner;

public class stringcompress {
    public static void main(String[] args)
    {
        System.out.print("Enter the string: ");
        Scanner obj = new Scanner(System.in);
        String s= obj.nextLine();

        String ans="";
        int i=1;
        char ch=s.charAt(0);
        ans=ans+ch;
        int count=1;
        while(i<s.length())
        {
            if(s.charAt(i) == ch){
                count++;
            }
            else{
                if(count>1){               
                    ans=ans+Integer.toString(count);
                }
                ch=s.charAt(i);
                ans=ans+ch;
                count=1;
            }   
            i++;       
        }
        System.out.println("The resulted string is : "+ans);
    }
}
