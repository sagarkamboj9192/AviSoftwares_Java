public class problem6 {
    public static void main(String[] args) {
        int n=5150;
        int val=n;
        int ans=0;
        while(val!=0)
        {
            int bit=val%10;
            ans=ans*10+bit;
            val=val/10;
        }
        if(ans == n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
