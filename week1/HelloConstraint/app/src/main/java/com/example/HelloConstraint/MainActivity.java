package com.example.HelloConstraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button bZero, bCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        bZero= (Button) findViewById(R.id.button_zero);
        bCount = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        bZero.setBackgroundResource(R.color.colorCyan);
        bCount.setBackgroundResource(R.color.colorMagenta);
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void zero(View view) {
        bZero.setBackgroundResource(R.color.colorGrey);
        bCount.setBackgroundResource(R.color.lightGrey);
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
    }
}
