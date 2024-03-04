package BankingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BankingSystem {
    public static Set<Integer> uniqueAccountno = new HashSet<>();                 // Store all account no's
    public static Set<Integer> uniqueTransactionid = new HashSet<>();            // Store all unique TransactionId
    public static List<BankAccount> accountDetails = new ArrayList<>();           // List contains all account details
    public static List<Transaction> transactionDetails = new ArrayList<>();           // List contains all transaction details
    public static HashMap<Integer, Integer> transactionaccount = new HashMap<>();      // Store TransactionId with accountNumber


    // method to add account  to  the  bank 
    public void addaccount(BankAccount bank){
        accountDetails.add(bank);
        System.out.println("New account is added with account no: "+bank.getaccountno());
    }

    // method to add transaction to the list
    public void addTransaction(Transaction tran)
    {
        transactionDetails.add(tran);
        System.out.println("Transaction is Done!");
    }

    // method to deposit money to the account
    public void depositMoney(int accountnumber, int money)
    {
        try{
            boolean check =true;
            for(BankAccount bank : accountDetails){
                if(bank.getaccountno() == accountnumber){
                    bank.addmoney(money);
                    check = false;
                    break;
                }
            }
            if(check){
                // System.out.println("There is no account with this account number");
                throw new BankException("There is no account with this account number");
            }
        } catch(BankException e){
            System.out.println(e);
        } catch(Exception e){
            System.out.println(e);
        }
        
    }

    // method to withdraw money from the account
    public void withdrawtMoney(int accountnumber, int money)
    {
        try{
            boolean check =true;
            for(BankAccount bank : accountDetails){
                if(bank.getaccountno() == accountnumber){
                    bank.withdrawMoney(money);
                    check = false;
                    break;
                }
            }
            if(check){
                throw new BankException("There is no account with this account number");
            }

        } catch (BankException e){
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
        }
         
    }

    // this method is used to do transfer
    public void transfer(int accountnumber, String typeofTransaction , int amount)
    {
        if(typeofTransaction.equals("deposit")){
            
            depositMoney(accountnumber, amount);
        }
        else if (typeofTransaction.equals("withdraw")){
            withdrawtMoney(accountnumber, amount);
        }
        else{
            System.out.println("Invalid Transaction Type......");
        }
    }
    
    public static void main(String[] args)
    {
        BankingSystem obj = new BankingSystem();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println();
            System.out.println("***************** BANK MANAGEMENT SYSTEM ********************");
            System.out.println("1. Add New Account ");
            System.out.println("2. Check Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Transfer or Withdraw Money to other accounts");
            System.out.println("6. Check Transaction Details");
            System.out.println("7. Exit");


            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    while(true)
                    {
                        try{
                            System.out.print("Enter the account no: ");
                            int accountNumber = sc.nextInt();
                            sc.nextLine();
                            
                            if(uniqueAccountno.contains(accountNumber)){
                                throw new BankException("Account no must be unique. Try again.");
                            } 
                            else {
                                uniqueAccountno.add(accountNumber);
                                System.out.print("Enter the name of the account holder: ");
                                String name = sc.nextLine();
                                BankAccount acc = new BankAccount(accountNumber, name,0);
                                obj.addaccount(acc);
                                break;
                            }
                        } catch(BankException e){
                            System.out.println(e);
                        } catch (Exception e){
                            System.out.println(e);
                        }
                        
                    }
                    break;
                case 2:
                    System.out.print("Enter the account no to check your detail: ");
                    int accountNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Details of your Account: ");
                    boolean check = true;
                    for(BankAccount bank : accountDetails){
                        if(bank.getaccountno() == accountNumber){
                            check = false;
                            System.out.println("The name of the account holder is: "+bank.getname());
                            System.out.println("The total balance is: "+bank.getbalance());
                            System.out.println("-----------------------");
                            break;
                        }
                    }
                    if(check){
                        System.out.println("There is no account with this account number");
                    }
                    break;
                case 3:
                    System.out.print("Enter the account no: ");
                    accountNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the money you want to deposit:  ");
                    int money= sc.nextInt();
                    sc.nextLine();
                    obj.depositMoney(accountNumber, money);
                    break;
                
                case 4:
                    System.out.print("Enter the account no: ");
                    accountNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the money you want to withdraw: ");
                    money= sc.nextInt();
                    sc.nextLine();
                    obj.withdrawtMoney(accountNumber, money);
                    break;

                case 5:
                    while(true)
                    {
                        System.out.print("Enter the transation id: ");
                        int transactionId = sc.nextInt();
                        sc.nextLine();
                        
                        if(uniqueTransactionid.contains(transactionId)){
                                System.out.println("Transaction ID  must be unique. Try again.");
                        } 
                        else {
                            uniqueTransactionid.add(transactionId);
                            System.out.print("Enter the transaction type: (Type- deposit or withdraw ) " );
                            String transactionType= sc.nextLine();
                            System.out.print("Enter the account no to which you want to do transaction: ");
                            accountNumber = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter the amount you want to tranfer: ");
                            int amount = sc.nextInt();
                            sc.nextLine();
                            Transaction tra = new Transaction(transactionId, transactionType, amount);
                            obj.addTransaction(tra);
                            obj.transfer(accountNumber, transactionType, amount);
                            transactionaccount.put(transactionId,accountNumber);
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.print("Enter the Transaction Id to check details: ");
                    
                    int transactionId = sc.nextInt();
                    boolean check1 = true;
                    for(Transaction tra : transactionDetails){
                        if(tra.gettransactionid() == transactionId){
                            check1=false;
                            System.out.println("The Transaction type is : "+tra.gettransactiontype());
                            System.out.println("The amount in the Transaction is : "+tra.getamount());
                            System.out.println("The Transaction is done with the account no : "+transactionaccount.get(tra.gettransactionid()));
                            System.out.println("----------------------------");
                        }
                    }
                    if(check1){
                        System.out.println("There is no transaction with this transaction id");
                    }
                    break;
                case 7:
                    System.out.println("Exiting....");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Type! Try again..");
            }
        }

    }
}
