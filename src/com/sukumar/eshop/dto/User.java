package com.sukumar.eshop.dto;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String userName;
    private String password;
    private Account account;
    private  Set<Integer> deliveryAddressIds;
    public User (){
        deliveryAddressIds = new HashSet<>();
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Integer> getDeliveryAddressList() {
        return deliveryAddressIds;
    }

    public boolean addDeliveryAddressId(Integer addressId) {
        return deliveryAddressIds.add(addressId);
    }
}
