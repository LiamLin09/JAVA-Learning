public class Main {
    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount();

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000.00);
        bobsAccount.setCustomerEmail("myemail@bob.com");
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerPhone("7789876543");
        
        bobsAccount.depositFund(500.00);
        bobsAccount.withdrawFunds(100.00);
    }
}