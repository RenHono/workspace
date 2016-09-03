package com.example.homework902_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText et;
	private Button btn;
	private long exitTime;
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
			if ((System.currentTimeMillis() - exitTime) > 2000) {
				Toast.makeText(getApplicationContext(), "再按一次退出程序", Toast.LENGTH_LONG).show();
				exitTime = System.currentTimeMillis();

			} else {

				finish();
				System.exit(0);

			}
			return true;

		}

		return super.onKeyDown(keyCode, event);
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		et=(EditText)findViewById(R.id.et);
		btn=(Button) findViewById(R.id.btn);
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(MainActivity.this, Jieguo.class);
				
				
				intent.putExtra("etzhi", 	et.getText().toString());
				
				startActivity(intent);
				Log.i("fpp", et.getText().toString());
				
				
			}
		});
		
	}

}
