package com.example.app5_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("fpp","onCreate");
	}

	public void open(View view){
		Intent intent = new Intent();
		intent.setClass(this, Sec.class);
		
		startActivity(intent);
		
	}
	
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("fpp","onStart");

	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();		Log.i("fpp","onRestart");

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();		Log.i("fpp","onResume");

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();		Log.i("fpp","onPause");

	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();		Log.i("fpp","onStop");

	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();		Log.i("fpp","onDestroy");

	}

}
