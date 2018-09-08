package com.venkateshsuvarna.carzbuy.model;

public class UserLoginModel implements IUserLoginModel{

    public String username;
    public String password;

    public UserLoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean validLoginCredentials(String username, String password) {
        if(username.equals(this.username) && password.equals(this.password)){
            return true;
        }
        return false;
    }

}
