package com.sukumar.eshop.account;

import com.sukumar.eshop.dto.Account;
import com.sukumar.eshop.dto.User;
import com.sukumar.eshop.repository.EShopRepository;

public class AccountModel {
    AccountView view;
    AccountModel(AccountView view){
        this.view = view;
    }

    void addAccount(Account account, String userName){

        User user = EShopRepository.getInstance().getUser(userName);
        if(user.getAccount() == null){
            view.onSuccessAddAccount(userName);
        }else{
            view.onFailedAddAccount(userName);
        }
    }

}
