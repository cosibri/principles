package dependency_inversion_principle.mindless;

public class CreditCard {

    public void pay(int amount, String purpose){
        System.out.println(amount + " eggs paid with CreditCard for " + purpose +".");
    }
}
