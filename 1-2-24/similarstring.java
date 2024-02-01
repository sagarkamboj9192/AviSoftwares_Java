import java.util.Scanner;
public class similarstring {
    public int simistr(String a, String b)
	{
		if(a.equals(b)){
			return 1;
		}
		if(a.length()%2 != 0){
			return 0;
		}
		String a1="";
        String a2="";
        String b1="";
        String b2="";

        for(int i=0;i<a.length()/2;i++)
        {
            a1+=a.charAt(i);
        }
        for(int i=a.length()/2;i<a.length();i++)
        {
            a2+=a.charAt(i);
        }

        for(int i=0;i<b.length()/2;i++)
        {
            b1+=b.charAt(i);
        }
        for(int i=b.length()/2;i<b.length();i++)
        {
            b2+=b.charAt(i);
        }

		if(a1.equals(b1)){
			return simistr(a2,b2);
		}
		else if(a1.equals(b2)){
			return simistr(a2,b1);
		}
		else{
			return 0;
		}
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the first string: ");
        Scanner obj = new Scanner(System.in);
        String s1=obj.nextLine();
        System.out.print("Enter the second string: ");
        String s2= obj.nextLine();

        similarstring ob = new similarstring();
        if (ob.simistr(s1, s2) == 1) {
            System.out.println(1);
        }
        else{

            System.out.println(0);
        }
        obj.close();
    }

    
}
