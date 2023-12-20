package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClickStart(View v) {
        startService(new Intent(this, MyService2.class).putExtra("time", 7));
        startService(new Intent(this, MyService2.class).putExtra("time", 2));
        startService(new Intent(this, MyService2.class).putExtra("time", 4));
    }
}