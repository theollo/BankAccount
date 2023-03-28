package org.example;

public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;



    public BankAccount(String inputFirstname, String inputLastname, String inputDateofbirth){

        this.firstName = inputFirstname;
        this.lastName = inputLastname;
        this.dateOfBirth = inputDateofbirth;
        this.accountNumber = 0;
        this.balance = 0;
    }

    public void setAccountNumber(int newAccountNumber){
        this.accountNumber = newAccountNumber;
    }
    public void setBalance(int newBalance){
        this.balance = newBalance;
    }
    public void deposit(int amount){
        balance+= amount;
    }
    public void withdraw(int amount){
        balance-= amount;
    }

    public void addInterest(double rate) {
        double interest = balance * rate / 100;
        balance += interest;
    }

public String update(){

    return "The clients name is " + this.firstName +" "+ this.lastName + " his DOB, account number and balance are " + this.dateOfBirth + ", " + this.accountNumber + ", " + this.balance + ".";
}
//getters and setters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public int getBalance(){
        return this.balance;
    }


}