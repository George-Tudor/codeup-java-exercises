package bank;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account(12345678, 450000, "Alexander Tudor", "george@georgetudor.com", "210-555-5555");


       account.customerInfo();
       account.depositFunds(499000);
       account.withdrawFunds(1000000);
    }
}
