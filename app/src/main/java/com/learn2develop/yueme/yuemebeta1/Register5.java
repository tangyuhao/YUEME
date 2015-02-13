package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Register5 extends Activity {
    static String student_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register5);

        TextView v = (TextView)findViewById(R.id.editText1);
        student_id = v.getText().toString();
        if(student_id != null){
            v.setText(student_id);
        }
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
