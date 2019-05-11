package com.appl.atm.model;

public class MasaDepan extends Customer {
    private double maxWithdrawal;
    private double maxTransfer;

    public MasaDepan(int theAccountNumber, int thePIN, int theAvailableBalance, int theTotalBalance) {
        super(theAccountNumber, thePIN, theAvailableBalance, theTotalBalance);
    }

    @Override
    public double getMaxWithdrawal() {
        return maxWithdrawal;
    }

    public void setMaxWithdrawal(double maxWithdrawal) {
        this.maxWithdrawal = maxWithdrawal;
    }

    @Override
    public int getMaxTransfer() {
        return maxTransfer;
    }

    public void setMaxTransfer(int maxTransfer) {
        this.maxTransfer = maxTransfer;
    }
}