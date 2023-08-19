public interface BankAccountInterface {
    String fetchBalance(String password);
    String addMoney(double amount);

    default String withDrawMoney(double amount, String password) {
        return null;
    }

    String changePassword(String oldPassword,String newPassword);
    double calculateInterest(int year);
}