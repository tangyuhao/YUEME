package login.learn2develop.net.login;


import android.app.Activity;
import android.content.Intent;
//import android.net.Uri;
import android.os.Bundle;
import android.view.View;
//import android.widget.EditText;

public class ChangeActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.changeactivity);
    }
    public void onClickone(View view){
        startActivity(new Intent("net.learn2develop.ChangeActivity"));
    }
    public void onClicktwo(View view){
        startActivity(new Intent("net.learn2develop.LoginActivity"));
    }
}

