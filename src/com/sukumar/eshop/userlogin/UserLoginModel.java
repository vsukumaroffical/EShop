package com.sukumar.eshop.userlogin;


import com.sukumar.eshop.dto.User;
import com.sukumar.eshop.register.RegisterView;
import com.sukumar.eshop.repository.EShopRepository;

class UserLoginModel {
        UserLoginView userLoginView;
        public UserLoginModel(UserLoginView userLoginView){
            this.userLoginView = userLoginView;
        }

        void authenticate(String userName,String password){
            User user = EShopRepository.getInstance().getUser(userName);

            if(user == null) {
                System.out.println("User does not exist. Please register first.");
                new RegisterView().getRegisterInfo();
                return;
            }

            if(!user.getUserName().equals(userName)){
                userLoginView.onFailedLogin("Invalid User name");
            }else if(!user.getPassword().equals(password)){
                userLoginView.onFailedLogin("Invalid Password");
            }else{
                userLoginView.onSuccessLogin();
            }
        }

}
