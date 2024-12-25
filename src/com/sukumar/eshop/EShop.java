package com.sukumar.eshop;

import com.sukumar.eshop.login.LoginView;

public class EShop {
    private static EShop eShop;
    private EShop(){
    }
    public  static EShop getInstance(){
        return (eShop == null)?(eShop = new EShop()):eShop;
    }
    public String getAppVersion(){
        return "1.0.0";
    }
    public String getAppName(){
        return EShop.class.getSimpleName();
    }

    public static void main(String[] args) {
        System.out.println("\tWelcome to " + getInstance().getAppName() + "!");
        System.out.println("\tVersion: " + getInstance().getAppVersion());
        new LoginView().showLoginOptions();
    }
}
