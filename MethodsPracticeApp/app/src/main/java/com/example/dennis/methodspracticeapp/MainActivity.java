package com.example.dennis.methodspracticeapp;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Create a TextView, refine it and pass it to the app when it loads
        TextView myText = new TextView(this);
        myText.setText(R.string.intro_message);
        myText.setTextSize(25);
        myText.setTextColor(Color.RED);
        myText.setAllCaps(true);
        myText.setTypeface(null, Typeface.BOLD_ITALIC);
        setContentView(myText);
    }
}
