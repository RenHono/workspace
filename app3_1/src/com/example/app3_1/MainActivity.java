package com.example.app3_1;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText etsec;
	private TextView etfirst;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		etsec = (EditText)findViewById(R.id.et1);
		etfirst= (TextView) findViewById(R.id.et2);
		
		etfirst.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
if(hasFocus){
	Toast.makeText(MainActivity.this, "获得焦点", Toast.LENGTH_SHORT).show();
}else{
	Toast.makeText(MainActivity.this, "失去焦点", Toast.LENGTH_SHORT).show();

}
			}
		});
		
		etfirst.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
etfirst.setText(s);			
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

	
	}
