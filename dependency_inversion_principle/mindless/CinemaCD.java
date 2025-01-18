package dependency_inversion_principle.mindless;

/**
 * Cinema with Debit and Credit Card Payment
 */
public class CinemaCD {
    private DebitCard debitCard;
    private CreditCard creditCard;

    public CinemaCD(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void doPayment(String someOrder, int amount) {
        if (this.debitCard != null) {
            debitCard.pay(amount, someOrder);
        }

        if (this.creditCard != null) {
            creditCard.pay(amount, someOrder);
        }

        if (this.debitCard == null && this.creditCard == null) {
            throw new IllegalArgumentException();
        }
    }
}
