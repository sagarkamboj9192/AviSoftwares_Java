package BankingSystem;


public class Transaction {
    
    private int transactionId;
    private String transactionType;
    private int amount;

    public Transaction(int transactionId,String transactionType, int amount){
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public int gettransactionid(){
        return this.transactionId;
    }

    public String gettransactiontype(){
        return this.transactionType;
    }

    public int getamount(){
        return this.amount;
    }
}
