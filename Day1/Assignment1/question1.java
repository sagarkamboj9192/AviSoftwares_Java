public class question1{
    public static void main(String[] pra)
    {
        String s= "Ab#$Cd";
        String ans="";
        
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char tem=s.charAt(i);
            if(tem >= 'A' && tem <='Z'){
                int n=tem+32;
                tem=(char) n;                    
            }  

            else if(tem >= 'a' && tem <='z'){
                int n=tem-32;
                tem = (char) n;    
            }
            ans=ans+tem;                      
        }

        System.out.println(ans);
    }
}