package com.venkateshsuvarna.carzbuy.model;

public interface IUserLoginModel {
    String getUsername();
    void setUsername(String username);
    String getPassword();
    void setPassword(String password);
    boolean validLoginCredentials(String username, String password);
}
