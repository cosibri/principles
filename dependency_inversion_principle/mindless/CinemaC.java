package dependency_inversion_principle.mindless;

/**
 * Cinema with Credit Card Payment
 */
public class CinemaC {

    private CreditCard creditCard;

    public CinemaC(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void doPayment(String someOrder, int amount) {
        creditCard.pay(amount, someOrder);
    }
}
