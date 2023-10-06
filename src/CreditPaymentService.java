public class CreditPaymentService {
    public int calculate(int amountCredit, int creditTerm, double interestRate) {
        double monthlyInterestRate = interestRate / 12 / 100;
        double exponent = Math.pow(1 + monthlyInterestRate, creditTerm);
        double annuityK = (monthlyInterestRate * exponent) / (exponent - 1);
        double creditPayment = annuityK * amountCredit;

        return (int) creditPayment;
    }
}