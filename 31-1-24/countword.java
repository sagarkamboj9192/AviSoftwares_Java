import java.util.Scanner;

public class countword {
    public static void main(String[] args)
    {
        System.out.print("Enter the string: ");
        Scanner obj = new Scanner(System.in);
        String s= obj.nextLine();

        int i=0;
        int count=0;
        while(i< s.length())
        {
            if(s.charAt(i) == ' ' ||  i == s.length()-1){
                count++;
            }
            i++;

        }
        System.out.println("total words is : "+count);
        obj.close();
    }
}
