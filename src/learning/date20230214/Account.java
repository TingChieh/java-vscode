package learning.date20230214;

public class Account {
    String name = null;
    double balance = 0, rate, a, b;

    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getrate() {
        return rate;
    }

    public void WithDraw(double a) {
        this.setBalance(this.balance - a);
    }

    public void Deposit(double b) {
        this.setBalance(this.balance + b);
    }

    public static void main(String[] args) {
        Account s1 = new Account("admin", 20000);
        s1.rate = 0.045;
        s1.WithDraw(2500);;
        s1.Deposit(3000);;
        s1.balance = s1.balance - s1.a + s1.b;
        System.out.println("用户"+s1.name+"账户余额为"+s1.balance+"当前月利率为"+s1.rate+"%，当月利息为"+s1.balance*s1.rate);
    }
}