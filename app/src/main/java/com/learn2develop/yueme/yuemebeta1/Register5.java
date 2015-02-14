package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.avos.avoscloud.AVUser;


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
        startActivity(new Intent(this,MainLogin.class));
    }


}
