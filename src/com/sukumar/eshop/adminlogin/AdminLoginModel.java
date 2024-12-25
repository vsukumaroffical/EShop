package com.sukumar.eshop.adminlogin;

import com.sukumar.eshop.repository.EShopRepository;

public class AdminLoginModel {
    AdminLoginView view;

    AdminLoginModel(AdminLoginView view){
        this.view = view;
    }

    void authenticate(String adminName,String password){
        EShopRepository repository = EShopRepository.getInstance();
        if(!"admin".equals(adminName)){
            view.onFailedLogin("Invalid admin name");
        }else if(!"admin123".equals(password)){
            view.onFailedLogin("Invalid password");
        }else{
            view.onSuccessLogin();
        }
    }
}
