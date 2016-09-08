package com.example.homework908_1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView lvinfo;

	private String url = "http://wthrcdn.etouch.cn/weather_mini?citykey=101300901";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lvinfo=(ListView) findViewById(R.id.lvinfo);

	}

	public void down(View view) {

		new GetWAT(this, lvinfo).execute(url);
	}

}
