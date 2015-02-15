package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.avos.avoscloud.AVCloudQueryResult;
import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVQuery;
import com.avos.avoscloud.AVUser;
import com.avos.avoscloud.CloudQueryCallback;
import com.avos.avoscloud.CountCallback;
import com.avos.avoscloud.FindCallback;

import java.lang.Object;
import java.util.List;


public class Register3 extends Activity {
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register3);

        if(MainLogin.gender.equals("Male")) {
            RadioButton radio = (RadioButton) findViewById(R.id.btnMan);
            radio.setChecked(true);
        }
        else {
            RadioButton radio1 = (RadioButton) findViewById(R.id.btnWoman);
            radio1.setChecked(true);
        }

        TextView v = (TextView) findViewById(R.id.editText);
        v.setText(MainLogin.nickname);

    }

    public void onRadioButtonClicked(View view)
    {
        boolean checked =((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.btnMan:
                if(checked)
                {
                    MainLogin.gender = "Male";
                }
                break;
            case R.id.btnWoman:
                if(checked)
                {
                    MainLogin.gender = "Female";
                }
                break;
        }
    }

    public void onClickone(View view)
    {
        TextView v = (TextView) findViewById(R.id.editText);
        MainLogin.nickname = v.getText().toString();
        startActivity(new Intent(this,Register2.class));
    }

    public void onClicktwo(View view)
    {
        TextView v = (TextView) findViewById(R.id.editText);
        MainLogin.nickname = v.getText().toString();

        if(MainLogin.nickname.equals(""))
        {
            new AlertDialog.Builder(this)
                    .setMessage("You haven't finished this step correctly.")
                    .setPositiveButton("Ok", null)
                    .show();
        }
        else
        {
            AVQuery<AVUser> query = AVUser.getQuery();

            query.whereEqualTo("username",MainLogin.nickname);
            query.findInBackground(new FindCallback<AVUser>() {
                public void done(List<AVUser> objects, AVException e) {
                    if (e == null) {
                        Log.i("Test", "共查询到用户  " + objects.size() + "  个");
                        // 查询成功

                        if(objects.size() == 0)
                        {
                            startActivity(new Intent(com.learn2develop.yueme.yuemebeta1.Register3.this, Register4.class));
                        }
                        else
                        {
                            new AlertDialog.Builder(com.learn2develop.yueme.yuemebeta1.Register3.this)
                                    .setMessage("Sorry, your nickname has been used.")
                                    .setPositiveButton("Ok", null)
                                    .show();
                            TextView v1 = (TextView) findViewById(R.id.editText);
                            v1.setText("");
                        }
                    } else {
                        Log.i("Test", "查询出错");
                        // 查询出错
                    }
                }
            });

        }
    }
}
