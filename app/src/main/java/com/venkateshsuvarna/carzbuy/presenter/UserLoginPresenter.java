package com.venkateshsuvarna.carzbuy.presenter;

import com.venkateshsuvarna.carzbuy.model.UserLoginModel;
import com.venkateshsuvarna.carzbuy.view.IUserLoginView;

public class UserLoginPresenter implements IUserLoginPresenter {

    IUserLoginView userLoginView;
    UserLoginModel userLoginModel;

    public UserLoginPresenter(IUserLoginView userLoginView){
        this.userLoginView = userLoginView;
        userLoginModel = new UserLoginModel("venkatesh","venkatesh");
    }

    @Override
    public void onLogin(String username, String password) {
        boolean validLogin = userLoginModel.validLoginCredentials(username,password);
        if(validLogin == true){
            userLoginView.showResult(true);
        }
        else{
            userLoginView.showResult(false);
        }
    }
}
