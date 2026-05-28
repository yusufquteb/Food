package com.my.newproject;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ScrollView;
import android.view.Gravity;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView scrollView = new ScrollView(this);
        TextView textView = new TextView(this);
        textView.setText("Debug Activity");
        textView.setTextColor(Color.BLACK);
        textView.setGravity(Gravity.CENTER);
        textView.setPadding(16, 16, 16, 16);
        scrollView.addView(textView);
        setContentView(scrollView);
    }
}
