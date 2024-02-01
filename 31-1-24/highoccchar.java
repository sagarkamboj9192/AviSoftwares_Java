import java.util.HashMap;
import java.util.Scanner;

public class highoccchar {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i) , 0)+1);
        }

        int max=mp.get(s.charAt(0));
        boolean check =true;
        Character ch=' ';
        for(Character i :mp.keySet())
        {
            System.out.print(i+" ");
            int j=mp.get(i);
            if(j> max){
                max=j;
                ch =i;
                check = false;  
            }
        }
        if(check){
            ch=s.charAt(0);
        }
        else{
            for(int i=0;i<s.length();i++)
            {
                if(mp.get(s.charAt(i)) == max){
                    ch=s.charAt(i);
                    break;
                }
            }
        }
        System.out.println("Highest occurening character is : "+ch);

        
    }
}
