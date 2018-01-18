package tw.com.pcschool.dd2018011002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        Intent it1 = new Intent(MainActivity.this, SecActivity.class);
        Bundle bd1 = new Bundle();
        bd1.putString("Data1", "第一頁的data");
        it1.putExtras(bd1);
        startActivity(it1);
    }

}
