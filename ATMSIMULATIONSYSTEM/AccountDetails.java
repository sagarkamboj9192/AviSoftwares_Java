package ATMSIMULATIONSYSTEM;

public class AccountDetails {
    private int cardNumber;
    private int cardPin;
    private String accountHolderName;
    private int accountBalance;

    public AccountDetails(int cardNumber, int cardPin, String accountHolderName, int accountBalance)
    {
        this.cardNumber = cardNumber;
        this.cardPin  = cardPin;
        this.accountHolderName = accountHolderName;
        this.accountBalance =  accountBalance;
    }

    public int getcardNumber(){
        return this.cardNumber ;
    }
    
    public int getcardPin(){
        return this.cardPin ;
    }

    public String getaccountHolderName(){
        return this.accountHolderName ;
    }

    public int getaccountBalance(){
        return this.accountBalance;
    }

    public void addmoney(int money){
        this.accountBalance += money;
        System.out.println(money + " is Credited to the account");
    }

    public void withdrawMoney(int money)
    {
        try{
            if(accountBalance < money){
                throw new NoMoneyException("Sorry Mate! You don't have enough money in your bank account");
            }
            else{
                this.accountBalance -= money;
                System.out.println(money + " is Debited from the account");
            }
        } 
        catch (NoMoneyException  e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }
}

