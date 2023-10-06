public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountCredit = 1_000_000;
        double interestRate = 9.99;
        int creditTerm = 12;
        double creditPayment = service.calculate(creditTerm, amountCredit, interestRate);
        System.out.println("Ежемесячный платеж: " + creditPayment);
    }
}