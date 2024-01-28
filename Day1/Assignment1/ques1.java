
public class ques1{
    public static void main(String[] pra)
    {
        String s="abcceetab";
        String temp="";
        String ans="";
        temp=temp+s.charAt(0);

        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            boolean check=false;
            for(int k=i+1;k<s.length();k++)
            {
                if(ch  == s.charAt(k)){
                    check=true;
                    break;
                }
            }
            if(!check){
                for(int j=0;j<temp.length();j++)
                {
                    if(ch  == temp.charAt(j)){
                        check=true;
                        break;
                    }
                }
            }
            
            temp=temp+ch;
            
            if(!check){
                ans = ans+ch;
            }
        }
        System.out.println(ans);

    }
}