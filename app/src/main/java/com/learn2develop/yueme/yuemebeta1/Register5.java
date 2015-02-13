package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Register5 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register5);
    }

    public void onClickone(View view)
    {
        startActivity(new Intent(this,Register4.class));
    }

    public void onClicktwo(View view)
    {
        startActivity(new Intent(this,MainLogin.class));
    }


}
