import java.util.Scanner;

public class comparevowels {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String s= obj.nextLine();

        int firstvowel=0;
        int secvowel=0;


        s=s.toLowerCase();
        for(int i=0;i<s.length()/2;i++)
        {
            char ch=s.charAt(i);
            if(ch =='a' || ch == 'e' ||ch == 'i' || ch == 'o' || ch == 'u'){
                firstvowel++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch =='a' || ch == 'e' ||ch == 'i' || ch == 'o' || ch == 'u'){
                secvowel++;
            }
        }

        if(firstvowel == secvowel){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        obj.close();
    }
}
