package dependency_inversion_principle.mindless;

public class DebitCard {

    public void pay(int amount, String purpose){
        System.out.println(amount + " eggs paid with DebitCard for " + purpose +".");
    }
}
