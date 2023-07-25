public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sum = 1_000_000;
        double rate = 9.99;

        System.out.println(service.calculate(sum, 12, rate));
        System.out.println(service.calculate(sum, 24, rate));
        System.out.println(service.calculate(sum, 36, rate));
    }
}


