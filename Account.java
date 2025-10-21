// Account class fraction methods example
class Account {
    public String name;
    public  double balance;
    // Constructor
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    // Methods
    public void debit() {
        System.out.println(this.name + ": Bank debit");
    }
    // Methods
    public void credit() {
        System.out.println(this.name + ": Bank credit");
    }
    // Getter for balance
    public double getBalance() {
        return balance;
    }
    // Main method to test the Account class
    public static void main(String[] args) {
        Account acc = new Account("Nitin", 1000.0);
        acc.debit();
        acc.credit();
        System.out.println("Balance: " + acc.getBalance());
    }
}
// End of Account class
