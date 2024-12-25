package com.sukumar.eshop.EShopSetup;

public class EShopSetupView {
    private EShopSetupModel   eShopSetupModel
    ;
    public EShopSetupView(){
        eShopSetupModel = new  EShopSetupModel(this);
    }
    public void init() {
        System.out.println("Welcome E-Shop Service");
    }

}
