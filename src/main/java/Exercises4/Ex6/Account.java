package Exercises4.Ex6;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        try {
            if (balance >= 0) {
                this.balance = balance;
            } else {
                System.out.print("balance khong hop le");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("always printed");
        }
    }
    public int credit( int amount) {
        balance += amount;
        return balance;
    }

    public int debit (int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo( Account another, int amount) {
        if (amount <= balance) {
            balance = amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
