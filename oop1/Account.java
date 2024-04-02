package oop1;

public class Account {
    int balance;

    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        if(balance - amount <0 ) {
            System.out.println("잔액이 부족합니다.");
        }else{
            balance -= amount;
        }
    }
    public void printBalance(){
        System.out.println("잔고: " + balance);
    }
}
