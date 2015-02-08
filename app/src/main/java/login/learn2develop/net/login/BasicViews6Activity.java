package login.learn2develop.net.login;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.AdapterView.OnItemSelectedListener;
        import android.widget.ArrayAdapter;
        import android.widget.Spinner;
        import android.widget.Toast;
        import android.content.Intent;
        import com.avos.avoscloud.AVOSCloud;
        import com.avos.avoscloud.AVAnalytics;
        import com.avos.avoscloud.AVObject;


public class BasicViews6Activity extends Activity {
    String[] presidents;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        presidents =
                getResources().getStringArray(R.array.presidents_array);
        Spinner s1 = (Spinner) findViewById(R.id.spinner1);

		/*
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, presidents);
        */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_single_choice, presidents);

        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(new OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> arg0,
                                       View arg1, int arg2, long arg3)
            {
                int index = arg0.getSelectedItemPosition();
                Toast.makeText(getBaseContext(),
                        "You have selected item : " + presidents[index],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) { }
        });
        AVOSCloud.initialize(this, "swn2ifqt2zq39pnn0cvcsigl6dg4drfy6ckv92bg96h4eogm", "3ykwum0u4ncfbh0879alk6qrtyowrw4t6dot8hex2mt7h2d8");
        AVAnalytics.trackAppOpened(getIntent());
    }
    public void onClick(View view){
        startActivity(new Intent("net.learn2develop.NameActivity"));
    }
}