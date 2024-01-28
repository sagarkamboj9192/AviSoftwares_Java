public class question4 {
    public static void main(String[] pra)
    {
        String s="ae#zyu*";
        int len=s.length();
        int vowel=0;
        int consonent=0;
        int other=0;
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u')
            {
                vowel++;
            }
            else if((ch >='a' && ch <='z') && (ch != 'a' || ch != 'e' || ch !='i' || ch != 'o' || ch != 'u')){
                consonent++;
            }
            else{
                other++;
            }
        }
        System.out.println("The number of vowels is: "+vowel);
        System.out.println("The number of consonants is: "+consonent);
        System.out.println("The number of other characters is: "+other);
    }
}
