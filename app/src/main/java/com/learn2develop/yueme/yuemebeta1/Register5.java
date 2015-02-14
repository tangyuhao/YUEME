package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.avos.avoscloud.AVCloudQueryResult;
import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVQuery;
import com.avos.avoscloud.AVUser;
import com.avos.avoscloud.CloudQueryCallback;


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

    public void onClickone(View view)
    {
        TextView v = (TextView)findViewById(R.id.editText1);
        MainLogin.student_id = v.getText().toString();
        startActivity(new Intent(this,Register4.class));
    }

    public void onClicktwo(View view)
    {
        TextView v = (TextView)findViewById(R.id.editText1);
        MainLogin.student_id = v.getText().toString();
        if(MainLogin.student_id.equals(""))
        {
            new AlertDialog.Builder(this)
                    .setMessage("You haven't finished this step correctly.")
                    .setPositiveButton("Ok", null)
                    .show();
        }
        else
        {
            String email = MainLogin.student_id + getResources().getStringArray(R.array.school_mail)[MainLogin.posi];
            AVUser usr = new AVUser();
            usr.setUsername(MainLogin.nickname);
            usr.setPassword(MainLogin.psw);
            usr.setEmail(email);

            startActivity(new Intent(this,MainLogin.class));
        }





    }


}
