package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


public class Register3 extends Activity {

    static String gender = "Male";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register3);

        if(gender.equals("Male")) {
            RadioButton radio = (RadioButton) findViewById(R.id.btnMan);
            radio.setChecked(true);
        }
        else {
            RadioButton radio1 = (RadioButton) findViewById(R.id.btnWoman);
            radio1.setChecked(true);
        }

    }

    public void onRadioButtonClicked(View view)
    {
        boolean checked =((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.btnMan:
                if(checked)
                {
                    gender = "Male";
                }
                break;
            case R.id.btnWoman:
                if(checked)
                {
                    gender = "Female";
                }
                break;
        }
    }

    public void onClickone(View view)
    {
        startActivity(new Intent(this,Register2.class));
    }

    public void onClicktwo(View view)
    {
        startActivity(new Intent(this,Register4.class));
    }
}
