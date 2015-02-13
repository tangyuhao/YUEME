package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVAnalytics;


public class MainLogin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        AVOSCloud.initialize(this, "n0q7bdc0vg1tb188z4evy0khzto6a32hos7ycadjpgd26bpc", "drgsp2o75vfru4ifet8rx2gw3lmqyu9sdp6ijjpo15bpwem8");
        AVAnalytics.trackAppOpened(getIntent());
    }

    public void onClickone(View view)
    {
        //检查登入成功则进入Mainisland
        startActivity(new Intent(this,Mainisland.class));
    }

    public void onClicktwo(View view)
    {

    }

    public void onClickthree(View view)
    {
        startActivity(new Intent(this,Register2.class));
    }
}
