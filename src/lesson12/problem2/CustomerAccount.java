package lesson12.problem2;

public class CustomerAccount {
    private final String customerName;
    private final String accountNumber;
    private double balance;

    CustomerAccount(String name, String acc, double balance) {
        this.customerName = name;
        this.accountNumber = acc;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("your account has been credited with $%.2f", amount);
            System.out.println();
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) throws WithdrawAmountExceedBalanceException, BalanceLessThanHundredException {
        if (amount > this.balance) {
            String message = "Withdraw amount is more than balance amount";
            throw new WithdrawAmountExceedBalanceException(message);
        }

        if (amount > 0) {
            this.balance -= amount;
            System.out.printf("your account has been debited with $%.2f", amount);
            System.out.println();

            if (this.balance < 100) {
                String message = "current balance is less than $100";
                throw new BalanceLessThanHundredException(message);
            }
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.customerName + ": " + this.accountNumber + " -> " + this.balance;
    }

    public static void main(String[] args) {
        CustomerAccount david = new CustomerAccount("David", "00876312", 10);

        System.out.println(david);
        System.out.println("deposit 500: " + david.deposit(500));
        System.out.println("current balance: " + david.getBalance());

        System.out.println();

        try {
            System.out.println("withdraw 200: " + david.withdraw(200));
        } catch (WithdrawAmountExceedBalanceException e) {
            System.out.println("err: " + e.getMessage());
        } catch (BalanceLessThanHundredException e) {
            System.out.println("warning: " + e.getMessage());
        }

        System.out.println("current balance: " + david.getBalance());
        System.out.println();

        try {
            System.out.println("withdraw 250: " + david.withdraw(250));
            System.out.println("after withdraw 200:");
            System.out.println(david);
        } catch (WithdrawAmountExceedBalanceException e) {
            System.out.println("err: " + e.getMessage());
        } catch (BalanceLessThanHundredException e) {
            System.out.println("warning: " + e.getMessage());
        }

        System.out.println("current balance: " + david.getBalance());
        System.out.println();

        try {
            System.out.println("withdraw 100: " + david.withdraw(100));
            System.out.println(david);
        } catch (WithdrawAmountExceedBalanceException e) {
            System.out.println("err: " + e.getMessage());
        } catch (BalanceLessThanHundredException e) {
            System.out.println("warning: " + e.getMessage());
        }

        System.out.println("current balance: " + david.getBalance());
    }
}
