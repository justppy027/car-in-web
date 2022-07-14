package com.example.carinweb.mvpschema;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.carinweb.R;
import com.example.carinweb.bean.CiwUser;
import com.example.carinweb.presenter.UserLoginPresenter;
import com.example.carinweb.view.IUserView;

public class LoginActivity extends AppCompatActivity implements IUserView {

    private Button mBtnLogin, mBtnReset;
    private EditText mETUserPhone, mETUserPwd;
    private ProgressBar mPbLoading;

    private UserLoginPresenter mUserLoginPresenter = new UserLoginPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void initWidgets() {
        // findVewById
    }


    @Override
    public String getUserPhone() {
        return mETUserPhone.getText().toString();
    }

    @Override
    public String getUserPwd() {
        return mETUserPwd.getText().toString();
    }

    @Override
    public int getUserStatus() {
        return 1;
    }

    @Override
    public void showProgressDialog() {
        mPbLoading.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressDialog() {
        mPbLoading.setVisibility(View.INVISIBLE);
    }

    @Override
    public void gotoMainView(CiwUser ciwUser) {
        Toast.makeText(this, "123", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showErrorMessage() {
        Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void clearUserPhone() {
        mETUserPhone.setText("");
    }

    @Override
    public void clearPassword() {
        mETUserPwd.setText("");
    }
}