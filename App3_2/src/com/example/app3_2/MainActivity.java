package com.example.app3_2;

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

	private EditText etsjm;
	private TextView tvxs;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	etsjm = (EditText)findViewById(R.id.shoujihao);
	tvxs = (TextView)findViewById(R.id.xianshi);
	
	etsjm.setOnFocusChangeListener(new OnFocusChangeListener() {
		
		@Override
		public void onFocusChange(View v, boolean hasFocus) {
			// TODO Auto-generated method stub
			if(hasFocus){
				Toast.makeText(MainActivity.this, "EditText获得焦点啦！", Toast.LENGTH_LONG).show();
			}else {
				Toast.makeText(MainActivity.this, "EditText失去焦点啦！", Toast.LENGTH_LONG).show();

			}
			
		}
	});
	
	etsjm.addTextChangedListener(new TextWatcher() {
		
		@Override
		public void onTextChanged(CharSequence s, int start, int before, int count) {
			// TODO Auto-generated method stub
			tvxs.setText(s);
			
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
