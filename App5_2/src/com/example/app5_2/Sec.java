package com.example.app5_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Sec extends Activity {

	private TextView tvinfo2;
	private TextView tvinfo;

	@Override

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sec);

		tvinfo = (TextView) findViewById(R.id.info);
		tvinfo2 = (TextView) findViewById(R.id.info2);
		Intent intent = getIntent();

		String str = intent.getStringExtra("kkk");
		int price = intent.getIntExtra("yyy", -1);
		
		tvinfo.setText(str);
		tvinfo2.setText(""+price);

	}

}
