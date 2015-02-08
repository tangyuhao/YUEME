package login.learn2develop.net.login;

/**
 * Created by lx on 2015/2/6.
 */
import android.app.Activity;
import android.content.Intent;
//import android.net.Uri;
import android.os.Bundle;
import android.view.View;
//import android.widget.EditText;

public class LoginActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);
    }
    public void onClickthree(View view){
        startActivity(new Intent("net.learn2develop.ChangeActivity"));
    }
    public void onClicktwo(View view){
        startActivity(new Intent(this,BasicViews6Activity.class));
    }
}

