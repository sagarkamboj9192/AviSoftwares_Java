import java.util.Scanner;

public class palindronestring {
    boolean check(String s, int i, int j)
    {
        if(i>=j){
            return true;
        }

        if(s.charAt(i)!= s.charAt(j)){
            return false;
        }
        return check(s, i+1, j-1);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        palindronestring ob = new palindronestring();
        System.out.println(ob.check(s, 0, s.length()-1));
        
        obj.close();

    }
}
