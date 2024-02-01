import java.util.HashMap;
import java.util.Scanner;

public class distinctsubst {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = obj.nextLine();

        HashMap<Character, Integer> mp= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        }

        int count=0;
        for(char i:mp.keySet())
        {
            int j=mp.get(i);
            if(j>1){
                count=count + (j-1);
            }
        }
        System.out.println(count);
    }
}
