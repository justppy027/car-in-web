package com.example.carinweb.model;

import com.example.carinweb.bean.CiwUser;

public interface OnLoginListener {

    void loginSuccess(CiwUser ciwUser);

    void loginFailed();
}
