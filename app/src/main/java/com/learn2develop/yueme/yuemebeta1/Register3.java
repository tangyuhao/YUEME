package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;


public class Register3 extends Activity {

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
        //在此可以添加对昵称设定的一些条件
        else {
            startActivity(new Intent(this, Register4.class));
        }
    }
}
