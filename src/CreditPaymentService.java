public class CreditPaymentService {
    public int calculate(double sum, double mounth, double rate) {
        //месячная ставка
        double mouthlyRate = rate / 12 / 100;
        double monthlyPaymentAmount = sum * mouthlyRate * (Math.pow(1 + mouthlyRate, mounth)) /
                (Math.pow(1 + mouthlyRate, mounth) - 1);
        return (int) monthlyPaymentAmount;

    }
}
