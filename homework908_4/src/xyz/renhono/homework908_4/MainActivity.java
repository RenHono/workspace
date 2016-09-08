package xyz.renhono.homework908_4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText etx;
	private ListView lvinfo;

	private String url;
	private String str;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		etx = (EditText) findViewById(R.id.etx);
		lvinfo = (ListView) findViewById(R.id.lvinfo);
	
		
	}

	public void down(View view) {
		str=etx.getText().toString();
		
		url = "http://api.k780.com:88/?app=idcard.get&idcard="+str+"&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json";
	//	Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();
		new GetAT(this, lvinfo).execute(url);
	}

}
