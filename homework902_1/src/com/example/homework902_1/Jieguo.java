package com.example.homework902_1;

import java.util.Random;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Jieguo extends Activity {

	private TextView tv2;
	private TextView tv22;
	String str = null;

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
		tv22.setText(""+str+":您的RP值为："+b);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

	}
}
