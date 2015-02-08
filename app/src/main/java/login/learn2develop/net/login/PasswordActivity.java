package login.learn2develop.net.login;

/**
 * Created by lx on 2015/2/6.
 */

import android.app.Activity;
import android.content.Intent;
//import android.content.Intent;
//import android.net.Uri;
import android.os.Bundle;
//import android.view.View;
//import android.widget.EditText;
import android.view.View;

public class PasswordActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passwordactivity);
    }
    public void onClicktwo(View view){
        startActivity(new Intent("net.learn2develop.LoginActivity"));
    }
    public void onClickone(View view){
        startActivity(new Intent("net.learn2develop.NumberActivity"));
    }
}