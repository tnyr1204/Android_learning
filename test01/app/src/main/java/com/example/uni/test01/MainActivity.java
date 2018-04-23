package com.example.uni.test01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ocClickButton(View view) {
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("ボタンがタップされました");
    }

}