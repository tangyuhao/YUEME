package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Register4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register4);

        TextView v1 = (TextView) findViewById(R.id.editText1);
        TextView v2 = (TextView) findViewById(R.id.editText2);

        v1.setText(MainLogin.psw);
        v2.setText(MainLogin.psw_confirm);
    }


    public void onClickone(View view)
    {
        TextView v1 = (TextView) findViewById(R.id.editText1);
        TextView v2 = (TextView) findViewById(R.id.editText2);
        MainLogin.psw = v1.getText().toString();
        MainLogin.psw_confirm = v2.getText().toString();
        startActivity(new Intent(this,Register3.class));
    }

    public void onClicktwo(View view)
    {
        TextView v1 = (TextView) findViewById(R.id.editText1);
        TextView v2 = (TextView) findViewById(R.id.editText2);
        MainLogin.psw = v1.getText().toString();
        MainLogin.psw_confirm = v2.getText().toString();

        if(MainLogin.psw_confirm.equals(MainLogin.psw) && !MainLogin.psw.equals(""))
        {
                // 若密码和确认密码一致，且已经有了填写，则才能跳到下一个注册界面
                startActivity(new Intent(this,Register5.class));
        }
        else
        {
            new AlertDialog.Builder(this)
                    .setMessage("You haven't finished this step correctly.")
                    .setPositiveButton("Ok", null)
                    .show();
        }
    }
}
