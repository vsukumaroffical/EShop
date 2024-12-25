package com.sukumar.eshop.login;

import com.sukumar.eshop.adminlogin.AdminLoginView;
import com.sukumar.eshop.register.RegisterView;
import com.sukumar.eshop.userlogin.UserLoginView;
import com.sukumar.eshop.util.ScannerUtil;

public class LoginView {

    public void showLoginOptions() {
        boolean flag = true;
        while (flag) {
            showLoginMenu();
            byte choice = ScannerUtil.getInstance().getByte();

            switch (choice) {
                case 1:
                    handleAdminLogin();
                    break;
                case 2:
                    handleUserLogin();
                    break;
                case 3:
                    handleUserRegistration();
                    break;
                case 9:
                    System.out.println("Exiting... Thank you for using BookMyShow!");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    private void showLoginMenu() {
        System.out.println("---- Login Menu ----");
        System.out.println("1. Admin Login");
        System.out.println("2. User Login");
        System.out.println("3. Register User");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");
    }

    private void handleAdminLogin() {
        new AdminLoginView().getAdminInfo();
    }

    private void handleUserLogin() {
        new UserLoginView().getUserInfo();
    }

    private void handleUserRegistration() {
        new RegisterView().getRegisterInfo();
    }

}
