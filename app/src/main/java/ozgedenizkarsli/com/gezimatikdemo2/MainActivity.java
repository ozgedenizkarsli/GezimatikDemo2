package ozgedenizkarsli.com.gezimatikdemo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void btn_click1(View view){
        Intent intent= new Intent(this,GeziActivity.class);
        startActivity(intent);
    }
    public void btn_click2(View view){
        Intent intent= new Intent(this,EkleActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
