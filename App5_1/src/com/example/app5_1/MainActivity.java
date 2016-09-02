package com.example.app5_1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btn4;
	private Button btn2;
	private Button btn3;
	private Button btnx;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("fpp", "onCreate");

		btn2 = (Button) findViewById(R.id.open2);
		btn3 = (Button) findViewById(R.id.open3);

		btn4 = (Button) findViewById(R.id.open4);
		
		btnx = (Button)findViewById(R.id.yinshi);
		
		
		btnx.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("yinshi");
				startActivity(intent);
						
			}
		});

		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, Sec.class);
				startActivity(intent);

			}
		});

		btn3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setClassName(MainActivity.this, "com.example.app5_1.Sec");
				startActivity(intent);
			}
		});

		btn4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				ComponentName c = new ComponentName("com.example.app4_3", "com.example.app4_3.MainActivity");
				intent.setComponent(c);
				startActivity(intent);

			}
		});

	}

	public void open(View view) {
		Intent intent = new Intent();
		intent.setClass(this, Sec.class);

		startActivity(intent);

	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("fpp", "onStart");

	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("fpp", "onRestart");

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("fpp", "onResume");

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("fpp", "onPause");

	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("fpp", "onStop");

	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("fpp", "onDestroy");

	}

}
