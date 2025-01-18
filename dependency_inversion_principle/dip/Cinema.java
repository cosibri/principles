package dependency_inversion_principle.dip;

/**
 * Looks similar to first coding of {@link dependency_inversion_principle.mindless.CinemaWithLimitedPayment}
 *
 * NO NEED FOR CHANGE, if CreditCard or other paymentType will be used
 **/
public class Cinema {
    private PaymentType paymentType;

    public Cinema(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void doPayment(String someOrder, int amount) {
        paymentType.pay(amount, someOrder);
    }
}
