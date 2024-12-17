package lesson12.problem2;

public class WithdrawAmountExceedBalanceException extends Exception {
    WithdrawAmountExceedBalanceException(String message) {
        super(message);
    }

    WithdrawAmountExceedBalanceException() {
        super();
    }
}
