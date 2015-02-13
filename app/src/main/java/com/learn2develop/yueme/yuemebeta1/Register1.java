package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Register1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);
    }

    public void onClickone(View view)
    {
        startActivity(new Intent(this,MainLogin.class));
    }

    public void onClicktwo(View view)
    {
        //先验证，如果验证成功，则跳转，不然显示手机验证错误

        startActivity(new Intent(this,Register2.class));
    }

}
