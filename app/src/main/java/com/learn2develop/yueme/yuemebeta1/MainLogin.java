package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVAnalytics;
import com.avos.avoscloud.AVUser;
import com.avos.avoscloud.LogInCallback;


public class MainLogin extends Activity {

    static int posi; // for the school choice
    static String gender; // for the gender choice
    static String nickname;
    static String student_id;
    static String psw;
    static String psw_confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        AVOSCloud.initialize(this, "n0q7bdc0vg1tb188z4evy0khzto6a32hos7ycadjpgd26bpc", "drgsp2o75vfru4ifet8rx2gw3lmqyu9sdp6ijjpo15bpwem8");
        AVAnalytics.trackAppOpened(getIntent());

        posi = 0;
        gender = "Male";
        nickname = "";
        student_id = "";
        psw = "";
        psw_confirm = "";


    }

    public void onClickone(View view)
    {
        //检查登入成功则进入Mainisland
        TextView t1 = (TextView) findViewById(R.id.editText1);
        TextView t2 = (TextView) findViewById(R.id.editText2);

        String username = t1.getText().toString();
        String password = t2.getText().toString();
        AVUser.logInInBackground(username, password, new LogInCallback() {
            public void done(AVUser user, AVException e) {
                if (user != null) {
                    // 登录成功
                    startActivity(new Intent(MainLogin.this,Mainisland.class));
                } else {
                    // 登录失败
                    new AlertDialog.Builder(MainLogin.this)
                            .setMessage("账号登入失败，请检查您的账号、密码是否正确以及邮箱是否已经验证")
                            .setPositiveButton("Ok", null)
                            .show();
                }
            }
        });

    }

    public void onClicktwo(View view)
    {

    }

    public void onClickthree(View view)
    {
        startActivity(new Intent(this,Register2.class));
    }
}
