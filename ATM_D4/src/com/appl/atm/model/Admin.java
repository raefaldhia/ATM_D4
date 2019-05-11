
package com.appl.atm.model;

import com.appl.atm.view.Screen;


public class Admin {
   private int accountNumber; // indicates account involved
   private int pin;
   
   public Admin(int userAccountNumber, int userPin) {

      accountNumber = userAccountNumber;
      pin = userPin;
   }

    /**
     * @return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }
    
}
