package dependency_inversion_principle.dip;

/**
 * Abstraction of {@link dependency_inversion_principle.mindless.DebitCard}
 */
public interface PaymentType {

    public void pay(int amount, String purpose);
}
