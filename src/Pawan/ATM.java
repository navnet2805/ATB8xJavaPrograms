package Pawan;
//encapsulation - hide implmentation. -
// private keyword and using getter() setter() methods.

public class ATM
{
   private int ATMpin = 5679;
   private int accbal = 40000;

    public int getATMpin() {
        return ATMpin;
    }

    public void setATMpin(int ATMpin) {
        this.ATMpin = ATMpin;
    }

    public int getAccbal() {
        return accbal;
    }

    public void setAccbal(int accbal) {
        this.accbal = accbal;
    }
}
