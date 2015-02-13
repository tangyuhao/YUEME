package com.learn2develop.yueme.yuemebeta1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Register2 extends Activity {

    private Spinner schoolSpinner = null;// 学校选择
    ArrayAdapter<String> schoolAdapter = null; //学校选择适配器
    private String[] schools = null;//存放学校内容的数组
    String mail_suffix = null;
    static int posi = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        schools = getResources().getStringArray(R.array.school_array);
        //下拉框函数
        schoolSpinner = (Spinner)findViewById(R.id.spin_school);
        schoolAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, schools);
        schoolSpinner.setAdapter(schoolAdapter);
        schoolSpinner.setSelection(posi,true);
        setSpinner();
    }

//    设置下拉框
    private void setSpinner()
    {
        schoolSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mail_suffix = getResources().getStringArray(R.array.school_mail)[position];
                posi = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mail_suffix = "fudan.edu.cn";
            }
        });

    }

//    上一步
    public void onClickone(View view)
    {
        startActivity(new Intent(this,MainLogin.class));
    }

//    下一步
    public void onClicktwo(View view)
    {
        startActivity(new Intent(this,Register3.class));
    }
}
