import com.finale.bank.Sbi;

public class Main extends Sbi {
//    public void cardOffers(){
//        System.out.println("Lifetime Free credit card with 1% cashback on all purchase !!!!");
//    }

//    ERROR: cardOffers()' cannot override 'cardOffers()' in 'com.finale.bank.Sbi'; overridden method is final


    public static void main(String[] args) {
        Sbi s = new Sbi();
//        s.loanInterest = 3;       ERROR: Cannot assign a value to final variable 'loanInterest'
        System.out.println("The loan interest rate is: "+ s.loanInterest);
        s.cardOffers();
    }
}