package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount("Theo", "Lloyd", "06.08.99");
        person1.setAccountNumber(47);
        person1.setBalance(100);
        int depositAmount = 50;
        person1.deposit(depositAmount);

        int withdrawalAmount = 25;
        person1.withdraw(withdrawalAmount);

        double interestRate = 2.5;
        person1.addInterest(interestRate);


        System.out.println(person1.update());
    }
}