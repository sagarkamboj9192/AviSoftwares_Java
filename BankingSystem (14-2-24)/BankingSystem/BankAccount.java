package BankingSystem;


public class BankAccount {
    
    private int accountNumber;
    private String name;
    public int balance;

    public BankAccount(int accountNumber ,String name, int balan){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balan;
    }

    public int getaccountno(){
        return this.accountNumber;
    }

    public String getname(){
        return this.name;
    }

    public int getbalance(){  
        return balance;
    }

    public void addmoney(int money){
        this.balance += money;
        System.out.println(money + " is Credited to the account");
    }

    public void withdrawMoney(int money)
    {
        try{
            if(balance < money){
                throw new BankException("Sorry Mate! You don't have enough money in your bank account");
            }
            else{
                this.balance -= money;
                System.out.println(money + " is Debited from the account");
            }
        } 
        catch (BankException  e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }
}
