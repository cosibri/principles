package dependency_inversion_principle.dip;

/**
 * Difference to {@link dependency_inversion_principle.mindless.CreditCard} is 'implements PaymentType'
 */
public class CreditCard implements PaymentType {

    public void pay(int amount, String purpose){
        System.out.println(amount + " eggs paid with CreditCard for " + purpose +".");
    }
}
