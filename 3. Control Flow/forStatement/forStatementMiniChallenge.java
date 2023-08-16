public class forStatementMiniChallenge {
    public static void main(String[] args) {

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmount = calculateInterest(100.0, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$10000.00 AT " + rate + "% interest = " + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
