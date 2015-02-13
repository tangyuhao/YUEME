package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Register4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register4);
    }


    public void onClickone(View view)
    {
        startActivity(new Intent(this,Register3.class));
    }

    public void onClicktwo(View view)
    {
        startActivity(new Intent(this,Register5.class));
    }


}
