import java.util.HashMap;
// import java.util.Map;
import java.util.Scanner;

public class permutstring {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1=obj.nextLine();
        System.out.print("Enter the second string: ");
        String s2=obj.nextLine();
        
        HashMap<Character, Integer>  mp = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            mp.put(s1.charAt(i), mp.getOrDefault(s1.charAt(i) , 0)+1);
        }

        HashMap<Character, Integer>  mp1 = new HashMap<>();
        for(int i=0;i<s2.length();i++){
            mp1.put(s2.charAt(i), mp1.getOrDefault(s2.charAt(i) , 0)+1);
        }

        if(mp.equals(mp1)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        obj.close();


    }
}
