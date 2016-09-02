package com.fpp.homework901_4;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends Activity {

	private AutoCompleteTextView actv;
	private MultiAutoCompleteTextView mactv;
	private String[] con ={"Canada","China","Japan","Korea","Russia","USA","Germany","UK"};
	private ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		actv = (AutoCompleteTextView) findViewById(R.id.actv);
		mactv = (MultiAutoCompleteTextView) findViewById(R.id.mactv);
		adapter =new ArrayAdapter<String>(this, R.layout.color, con);
		
		actv.setAdapter(adapter);
		mactv.setAdapter(adapter);
		mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
		
	}

}
