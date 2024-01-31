import java.util.Scanner;

public class palindronestr {
    public static void main(String[] args)
    {
        System.out.print("Enter the string: ");
        Scanner obj = new Scanner(System.in);
        String s= obj.nextLine();
        int i=0;int j=s.length()-1;
        boolean check = true;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                check = false;
            }
            i++;
            j--;
        }
        System.out.println(check);
        obj.close();
    }
}
