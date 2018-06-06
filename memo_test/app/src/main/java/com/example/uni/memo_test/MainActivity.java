package com.example.uni.memo_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		//元に戻す
		ImageButton undo = (ImageButton) findViewById(R.id.undo);
		undo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				DrawView drawView = (DrawView)findViewById(R.id.draw1);
				drawView.undo();
			}
		});

		//やり直す
		ImageButton redo = (ImageButton) findViewById(R.id.redo);
		redo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				DrawView drawView = (DrawView)findViewById(R.id.draw1);
				drawView.redo();
			}
		});

		//消去
		ImageButton clear = (ImageButton) findViewById(R.id.clear);
		clear.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				DrawView drawView = (DrawView)findViewById(R.id.draw1);
				drawView.clear();
			}
		});
	}

	//ビューサイズ確認
	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		Log.d("MainActivity", "横幅: " + findViewById(R.id.draw1).getWidth());
		Log.d("MainActivity", "縦幅: " + findViewById(R.id.draw1).getHeight());
	}
}