package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Register_successful extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_successful);
    }

    public void onClick(View view)
    {
        startActivity(new Intent(this, MainLogin.class));
    }

}
