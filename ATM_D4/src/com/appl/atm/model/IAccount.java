package com.appl.atm.model;

public interface IAccount {
    public default boolean isAdmin() {
        return false;
    }

    public default boolean isCustomer() {
        return false;
    }
}