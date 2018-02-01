package com.example.dennis.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);

        // Testing out Toast and Log.i
        Toast.makeText(this, "This is but a drill", Toast.LENGTH_LONG).show();

        Log.i("info", "Also a drill");
    }


}