package dependency_inversion_principle;

import dependency_inversion_principle.dip.Cinema;
import dependency_inversion_principle.dip.PaymentType;
import dependency_inversion_principle.mindless.CinemaC;
import dependency_inversion_principle.mindless.CinemaCD;
import dependency_inversion_principle.mindless.CreditCard;
import dependency_inversion_principle.mindless.CinemaD;
import dependency_inversion_principle.mindless.DebitCard;


public class Main {
    public static void main(String[] args) {
        /*
         * Mindless coding
         */

        //  Pay with debit card in cinema
        DebitCard debitCard = new DebitCard();
        CinemaD cinemaD = new CinemaD(debitCard);
        cinemaD.doPayment("Some movie",50);

        /* What if you want to use a credit card instead of debit card ? **/
        /* 1. Adding new class for credit card (FYI: this step you also need with DIP)
         *
         * 2. Change {@link CinemaD} to CreditCard <br />
         *    for explaining the enhancement will be the {@link CinemaC} <br />
         *    or maybe you would enhance to {@link dependency_inversion_principle.mindless.CinemaCD}
         **/

        //  Pay with credit card in cinema
        CreditCard creditCard = new CreditCard();
        CinemaC cinemaC = new CinemaC(creditCard);
        cinemaC.doPayment("Some movie",50);

        //  Pay with credit card in cinema
        CinemaCD cinemaCD = new CinemaCD(creditCard);
        cinemaCD.doPayment("Some movie",50);

        /*
         * And the Dependency Inversion Principle presents better cleaner more flexible code:
         */

        //  Pay with debit card in cinema
        PaymentType paymentType = new dependency_inversion_principle.dip.DebitCard();
        Cinema cinema = new dependency_inversion_principle.dip.Cinema(paymentType);
        cinema.doPayment("Some movie",42);

        // Or pay with credit card in cinema
        PaymentType otherPaymentType = new dependency_inversion_principle.dip.CreditCard();
        Cinema c= new Cinema(paymentType);
        c.doPayment("Some movie",42);

        /* as you see: difference to debit card is just the assignment to paymentType
         *
         * no need for changing details in classes
         **/

        /*
         * At this point you should become aware that payment possibilities are not only used in
         * cinemas
         *
         * next step would be to DIP the cinema, so that payment is possible in the pharmacy or
         * some other kind of store
         */
    }
}