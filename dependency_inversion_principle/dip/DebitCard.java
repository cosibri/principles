package dependency_inversion_principle.dip;

/**
 * Difference to {@link dependency_inversion_principle.mindless.DebitCard} is 'implements PaymentType'
 */

public class DebitCard implements PaymentType {

    @Override
    public void pay(int amount, String purpose){
        System.out.println(amount + " eggs paid with DebitCard for " + purpose +".");
    }
}
