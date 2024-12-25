package com.sukumar.eshop.register;

import com.sukumar.eshop.dto.User;
import com.sukumar.eshop.repository.EShopRepository;

class RegisterModel {
    RegisterView view;
    RegisterModel(RegisterView view) {
        this.view = view;
    }

    public void authenticate(User user) {
        User selectedUser = EShopRepository.getInstance().getUser(user.getUserName());
        if(selectedUser == null){
            EShopRepository.getInstance().addUser(user);
            view.onSuccessRegister(user);
        }else{
            view.onFailedRegister();
        }
    }
}

