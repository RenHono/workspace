package com.example.app4_3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
	
	private AutoCompleteTextView info;
	
	private String[] hotwords={"asdsadas","adsadsadvgdsg","asafretet","ssadafas","dasd"};
	
private ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		info = (AutoCompleteTextView)findViewById(R.id.info);
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, hotwords);
		
		info.setAdapter(adapter);
	}

}
