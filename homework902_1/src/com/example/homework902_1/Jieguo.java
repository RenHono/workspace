package com.example.homework902_1;

import java.util.Random;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Jieguo extends Activity {
	private long exitTime = 0;
	private TextView tv2;
	private TextView tv22;
	String str = null;

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
			if ((System.currentTimeMillis() - exitTime) > 2000) {
				Toast.makeText(getApplicationContext(), "再按一次返回主界面", Toast.LENGTH_LONG).show();
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
		setContentView(R.layout.activity_jieguo);
		tv2 = (TextView) findViewById(R.id.tv2);
		tv22 = (TextView) findViewById(R.id.tv22);

		Intent intent = getIntent();

		str = intent.getStringExtra("etzhi");

		long a = str.hashCode();
		Random random = new Random(a);
		int b = (int) Math.abs(random.nextDouble() * 100);
		tv22.setText("" + str + ":您的RP值为：" + b);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

	}
}
