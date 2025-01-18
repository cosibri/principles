package dependency_inversion_principle.mindless;
/**
 * Cinema with Debit Card Payment
 */
public class CinemaD {
    private DebitCard debitCard;

    public CinemaD(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPayment(String someOrder, int amount) {
            debitCard.pay(amount, someOrder);
    }
}
