import java.util.Scanner;

public class binaryaddition {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1=obj.nextLine();
        System.out.print("Enter the second string: ");
        String s2=obj.nextLine();
        
        int i=s1.length()-1;
        int j=s2.length()-1;
        StringBuilder ans = new StringBuilder();
        int carry=0;
        while (i>=0 && j>=0) {
            if(carry == 0 && ((s1.charAt(i) == '0' && s2.charAt(j) == '1') ||(s1.charAt(i) == '1' && s2.charAt(j) =='0')))
            {
                ans.append('1');
                carry=0;
            }
            else if(carry == 1 && ((s1.charAt(i) == '0' && s2.charAt(j) == '1') ||(s1.charAt(i) == '1' && s2.charAt(j) =='0')))
            {
                ans.append('0');
                carry=1;
            }
            else if(carry == 1 && (s1.charAt(i) == '1' && s2.charAt(j) == '1')){
                ans.append('1');
                carry=1;
            }
            else if(carry == 0 && (s1.charAt(i) == '1' && s2.charAt(j) == '1')){
                ans.append('0');
                carry=1;
            }
            i--;
            j--;
        }
        while(i>=0){
            if(carry == 0 && (s1.charAt(i) == '0' || s1.charAt(i) == '1')){
                ans.append(s1.charAt(i));
                carry=0;
            }
            else if(carry == 1 && s1.charAt(i) == '0'){
                ans.append('1');
                carry=0;
            }
            else{
                ans.append('0');
                carry=1;
            }
            i--;
        }
        while(j>=0){
            if(carry == 0 && (s2.charAt(j) == '0' || s2.charAt(j) == '1')){
                ans.append(s2.charAt(j));
                carry=0;
            }
            else if(carry == 1 && s2.charAt(j) == '0'){
                ans.append('1');
                carry=0;
            }
            else{
                ans.append('0');
                carry=1;
            }
            j--;
        }
        if(carry!=0){
            ans.append('1');
        }

        ans.reverse();

        System.out.println(ans);
        obj.close();
    }
}
