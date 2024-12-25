package com.sukumar.eshop.repository;

import com.sukumar.eshop.dto.*;

import java.util.HashMap;
import java.util.Map;

public class EShopRepository {
    private static  EShopRepository instance =null;
    private Admin admin;
    private Map<String, User> users = new HashMap<>();
    private Map<Integer, Address> addressMap = new HashMap<>();
    private Map<String, Account> accountMap = new HashMap<>();
    private Map<Integer,Transaction> transactionMap = new HashMap<>();
    private EShopRepository(){
    }

    public static EShopRepository getInstance(){
        if (instance == null){

            instance = new EShopRepository();
        }
        return instance;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public User getUser(String userName) {
        if(users.containsKey(userName))
            return users.get(userName);
        return null;
    }

    public void addUser(User user) {
        users.put(user.getUserName(),user);
    }

    public void addAddress(Address address){
        addressMap.put(address.getAddressId(),address);
    }

    public void addAccount(Account account){
        accountMap.put(account.getAccountNumber(),account);
    }

    public void addTransaction(Transaction transaction){
        transactionMap.put(transaction.getTransactionId(),transaction);
    }
}
















