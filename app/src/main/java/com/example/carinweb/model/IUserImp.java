package com.example.carinweb.model;

import com.example.carinweb.bean.CiwUser;

public class IUserImp implements IUserModel{

    @Override
    public void login(final String phone, final String pwd, OnLoginListener onLoginListener){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if("666".equals(phone) && "123".equals(pwd)) {
                    CiwUser ciwUser = new CiwUser();
                    ciwUser.setPhone(phone);
                    ciwUser.setPasswd(pwd);
                    onLoginListener.loginSuccess(ciwUser);
                } else {
                    onLoginListener.loginFailed();
                }
            }

        }).start();
    }

}
