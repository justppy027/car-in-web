package com.example.carinweb.view;

import com.example.carinweb.bean.CiwUser;

public interface IUserView {
    String getUserPhone();
    String getUserPwd();
    int getUserStatus();

    void showProgressDialog();

    void hideProgressDialog();

    void gotoMainView(CiwUser ciwUser);

    void showErrorMessage();

    void clearUserPhone();

    void clearPassword();
}
