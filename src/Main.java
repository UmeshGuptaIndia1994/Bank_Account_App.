
public class Main {
    public static void main (String[] args) throws java.lang.Exception{

        SBIAccount umeshAcc = new SBIAccount("Umesh", "Umesh123", 10000);

        System.out.println(umeshAcc); // printed the attributes via toString

        // fetch balance
        System.out.println(umeshAcc.fetchBalance("random"));  // wrong password
        System.out.println(umeshAcc.fetchBalance("Umesh123"));  //correct password

        // add money
        System.out.println(umeshAcc.addMoney(3000));

        // withdraw
        System.out.println(umeshAcc.withDrawMoney(2000,"Umesh123"));
        System.out.println(umeshAcc.withDrawMoney(50000,"Umesh123"));
        System.out.println(umeshAcc.withDrawMoney(50000,"random"));


        // change Password
        System.out.println(umeshAcc.changePassword("Umesh123","Umesh1999"));
        System.out.println(umeshAcc.fetchBalance("Umesh1999"));

        //calculate interest
        System.out.println("Interest for 5 years on current balance will be: " + umeshAcc.calculateInterest(5));
    }
}
