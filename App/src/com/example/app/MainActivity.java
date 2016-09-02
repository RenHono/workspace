package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText etusername;
	private Button btwelcome;
	private EditText etpassword;


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		etusername = (EditText	)findViewById(R.id.etusername);
		etpassword = (EditText)findViewById(R.id.etpassword);
		btwelcome = (Button)findViewById(R.id.btwelcome);
		
		btwelcome.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			String info = etusername.getText().toString();
			String pass = etpassword.getText().toString();
			
			if("admin".equals(info)&&"123".equals(pass)){
				Toast.makeText(MainActivity.this, info+",下午好",Toast.LENGTH_LONG).show();
			}
			
				//Toast.makeText(MainActivity.this, info+",下午好",Toast.LENGTH_LONG).show();
			}
		});
		
	}


}
