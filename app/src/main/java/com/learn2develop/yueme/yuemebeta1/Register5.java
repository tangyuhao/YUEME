package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.avos.avoscloud.AVCloudQueryResult;
import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVQuery;
import com.avos.avoscloud.AVUser;
import com.avos.avoscloud.CloudQueryCallback;
import com.avos.avoscloud.LogUtil;
import com.avos.avoscloud.RequestEmailVerifyCallback;
import com.avos.avoscloud.SignUpCallback;


public class Register5 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register5);
        TextView v = (TextView)findViewById(R.id.editText1);
        if(MainLogin.student_id != null){
            v.setText(MainLogin.student_id);
        }
    }
  //  boolean tag;
    String email;
    AVUser user;

    public void onClickone(View view)
    {
        TextView v = (TextView)findViewById(R.id.editText1);
        MainLogin.student_id = v.getText().toString();
        startActivity(new Intent(this,Register4.class));
    }

    public void onClicktwo(View view)
    {
        user = new AVUser();

        user.setUsername(MainLogin.nickname);
        user.setPassword(MainLogin.psw);

        TextView v = (TextView)findViewById(R.id.editText1);
        MainLogin.student_id = v.getText().toString();

        if(MainLogin.student_id.equals(""))
        {
            new AlertDialog.Builder(this)
                    .setMessage("请填写学号！")
                    .setPositiveButton("Ok", null)
                    .show();
        }
        else
        {
            email = MainLogin.student_id + getResources().getStringArray(R.array.school_mail)[MainLogin.posi];
            user.setEmail(email);
            user.signUpInBackground(new SignUpCallback() {
                @Override
                public void done(AVException e) {
                    if(e == null)
                    {
                        Log.i("Test","邮箱已经成功保存");
                        AVUser.requestEmailVerfiyInBackground(email, new RequestEmailVerifyCallback() {
                            @Override
                            public void done(AVException e)
                            {
                                if (e == null)
                                {
                                    Log.i("Test","验证邮件已经成功发送");
                                    new AlertDialog.Builder(com.learn2develop.yueme.yuemebeta1.Register5.this)
                                            .setMessage("证邮件已经成功发送！")
                                            .setPositiveButton("Ok", null)
                                            .show();
                                    startActivity(new Intent(com.learn2develop.yueme.yuemebeta1.Register5.this, Register_successful.class));
                                }
                                else
                                {
                                    Log.i("Test", "发送验证邮件失败，说明学号不正确或者网络问题");
                                    new AlertDialog.Builder(com.learn2develop.yueme.yuemebeta1.Register5.this)
                                            .setMessage("发送验证邮件失败，说明学号不正确或者网络问题!")
                                            .setPositiveButton("Ok",null)
                                            .show();
                                    user.deleteInBackground();
                                }
                            }
                        });
                    }
                    else
                    {
                        Log.i("Test","无法保存，说明邮箱已经被使用或者网络问题");
                        new AlertDialog.Builder(com.learn2develop.yueme.yuemebeta1.Register5.this)
                                .setMessage("账号无法保存，说明邮箱已经被使用或者网络问题")
                                .setPositiveButton("Ok", null)
                                .show();
                    }
                }
            });
        }


    }


}
