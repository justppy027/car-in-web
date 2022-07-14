package com.example.carinweb.presenter;

import android.os.Handler;

import com.example.carinweb.bean.CiwUser;
import com.example.carinweb.model.IUserImp;
import com.example.carinweb.model.IUserModel;
import com.example.carinweb.model.OnLoginListener;
import com.example.carinweb.view.IUserView;


public class UserLoginPresenter {

    private IUserModel iUserModel;
    private IUserView iUserView;
    private Handler mHandler = new Handler();

    public UserLoginPresenter(IUserView iUserView) {
        this.iUserView = iUserView;
        iUserModel = new IUserImp();
    }

    public void doLogin() {
        iUserView.showProgressDialog();

        iUserModel.login(iUserView.getUserPhone(), iUserView.getUserPwd(), new OnLoginListener() {
            @Override
            public void loginSuccess(final CiwUser ciwUser) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        iUserView.gotoMainView(ciwUser);
                        iUserView.hideProgressDialog();
                    }
                });
            }

            @Override
            public void loginFailed() {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        iUserView.showErrorMessage();
                        iUserView.hideProgressDialog();
                    }
                });
            }
        });
    }

    //------------
    public void doReset() {
        iUserView.clearUserPhone();
        iUserView.clearPassword();
    }


}
