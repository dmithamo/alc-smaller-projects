package com.example.dennis.hellorelative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
//        Make Toast and show it when button is clicked
        Toast myToast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);
        myToast.show();
    }

    public void countUp(View view) {
        mCount += 1;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }

    public void reset(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toOctalString(mCount));
    }
}
