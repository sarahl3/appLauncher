package com.example.applauncher;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (getIntent().hasExtra("com.example.applauncher.SOMETHING")) {
        TextView tv = (TextView) findViewById(R.id.textView);
        String text = getIntent().getExtras().getString("com.example.applauncher.SOMETHING");
        tv.setText(text);
        }
    }
}
