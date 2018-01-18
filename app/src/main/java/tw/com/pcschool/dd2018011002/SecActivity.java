package tw.com.pcschool.dd2018011002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Intent it1 = getIntent();
        Bundle bd1 = it1.getExtras();
        String str1 = bd1.getString("Data1");
        TextView tv1 = (TextView) findViewById(R.id.textView);
        tv1.setText(str1);
    }
}
