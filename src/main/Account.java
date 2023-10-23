package main;

public class Account {
    private int balance;

    public Account(int i) {
        this.balance = i;   //내부 필드에 저장하는 로직 miss
    }

    public int getBalance() {
        return this.balance;
    }
}
