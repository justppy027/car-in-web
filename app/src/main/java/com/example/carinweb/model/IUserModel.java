package com.example.carinweb.model;

public interface IUserModel {
    public void login(String phone, String pwd, OnLoginListener onLoginListener);
}
