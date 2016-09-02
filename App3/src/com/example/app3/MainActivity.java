package com.example.app3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private TextView tvinfo;
	private TextView tva;
	private TextView tvb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvinfo = (TextView)findViewById(R.id.dian);
tva = (TextView)findViewById(R.id.diana);
tvb = (TextView)findViewById(R.id.dianb);
		
tvb.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		Toast.makeText(MainActivity.this, "A的点击被设置了"	, Toast.LENGTH_LONG	).show();		

tva.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
Toast.makeText(MainActivity.this, "A被点击了"	, Toast.LENGTH_LONG	).show();		
	}
});		
	}
});


		
tvinfo.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
Toast.makeText(MainActivity.this, "这是我的第一个点击事件", Toast.LENGTH_LONG).show();	
	}
});
		
		
		
	}
}
