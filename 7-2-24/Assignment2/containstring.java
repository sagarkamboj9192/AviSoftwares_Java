public class containstring {
    boolean checkstring(String s, String[] arr)
    {
        boolean ans =false;
        boolean check3 = false;
        int var=0;int i=0;
        while(i<arr.length)
        {
            boolean check2=false;
            String temp=arr[i];
            int j=var;int k=0;
            
            while(j<s.length())
            {
                int tem=j;
                boolean check =  false;
                if(s.charAt(j) == temp.charAt(k)){
                    while(k< temp.length() && j< s.length())
                    {
                        if(s.charAt(j)!=temp.charAt(k)){
                            break;
                        }
                        j++;
                        k++;
                    }
                    if(j-tem == temp.length()){
                        
                        var=j;
                        check=true;
                        
                    }
                    else{
                        j=tem+1;
                        continue;
                    }

                }
                if(check){
                    check2=true;
                    if(i+1 == arr.length && j < s.length()){
                        i=0;
                        check3=true;
                    }
                    break;
                }
                j++;
            }
            if(check3){
                ans=true;
                check3=false;
                continue;
            }
            if(j == s.length()  && check2 ){
                if(i+1 == arr.length){
                    ans=true;
                    break; 
                }
            }
            i++;
        }
        return ans;


        
        // boolean[] dp = new boolean[s.length() + 1];
        // dp[0] = true;

        // for (int i = 1; i <= s.length(); i++) {
        //     for (String word : arr) {
        //         if (i >= word.length() && dp[i - word.length()] && s.substring(i - word.length(), i).equals(word)) {
        //             dp[i] = true;
        //             break;
        //         }
        //     }
        // }
        // return dp[s.length()];


    }
    public static void main(String[] args)
    {
        String s = "jammukashmirjammu";
        String[] arr = new String[]{"jammu","kashmir"};

        containstring obj = new containstring();
        System.out.println(obj.checkstring(s, arr));
    }
}
