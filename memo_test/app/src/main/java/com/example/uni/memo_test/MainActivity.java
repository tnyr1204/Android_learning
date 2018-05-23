package com.example.uni.memo_test;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		DrawView view = new DrawView(this);
		setContentView(view);
	}

}