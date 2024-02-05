// import java.util.Scanner;

public class filterstring {
    String filter(String[] arr)
    {
        String ans="";
        for(int i=0;i<arr.length;i++)
        { 
            boolean check =false;
            boolean check2=false;
            String s= arr[i];
            int k=0;
            while(k<s.length()){
                if(s.charAt(k)!=' '){
                    break;
                }
                k++;
            }
            for(int j=k;j<s.length();j++)
            { 
                if(j+1<s.length() && (s.charAt(j) ==' ' && s.charAt(j+1) == ' ')){
                    continue;
                }
                if(s.charAt(j) ==' '){
                    check=true;
                }
                
                if((s.charAt(j) >='0' && s.charAt(j) <='9') || (s.charAt(j) == ' ' && j == s.length()-1)){
                    continue;
                }
                if((j == 0 || s.charAt(j-1) == ' ' )){
                    ans=ans+ Character.toUpperCase(s.charAt(j));
                    check=false;
                }
                else{
                    check2=true;
                    if(check){
                        ans=ans+ Character.toUpperCase(s.charAt(j));
                        if(s.charAt(j)!= ' '){
                            check=false;
                        }
                    }
                    else{
                        ans+=s.charAt(j);     
                    }
                }
            }
            if(i!=arr.length-1 && s.length() != 0 && check2){
                ans+=' ';
            }
        }
        return ans;

    }
    public static void main(String[] args)
    {
        
        String[] arr = new String[]{"break3ing news5:  ", "   1A 1circle is round!"};
        filterstring obj = new filterstring();

        System.out.println("Output: "+obj.filter(arr));


    }
}
