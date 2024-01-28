public class ques3 {
    public static void main(String[] pra)
    {
        int n=123456;
        int even=0;
        int odd=0;
        while(n!=0){
            int val=n%10;
            if(val %2 == 0){
                even+=val;
            }
            else{
                odd+=val;
            }
            n=n/10;
        }

        System.out.println(even+ " "+ odd);
    }
}
