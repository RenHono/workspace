package com.example.app2;

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

	private EditText yyname;
	private EditText yypass;
	private Button yybb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main5);
		
//		yyname = (EditText)findViewById(R.id.un);
//		yypass =(EditText)findViewById(R.id.pw);
//		yybb =(Button)findViewById(R.id.bb);
//		
//		
//		yybb.setOnClickListener(new ButtonOnClickListener(this));
//		
//		yybb.setOnClickListener(new OnClickListener() {
			
//			@Override
//			public void onClick(View v) {
//				String unx = yyname.getText().toString();
//				String pwx = yypass.getText().toString();
//				if("fpp".equals(unx)&&"123".equals(pwx)){
//					Toast.makeText(MainActivity.this, "欢迎进入音乐播放器", Toast.LENGTH_LONG).show();
//					
//					
//				}else{
//					Toast.makeText(MainActivity.this,"滚你妈的！！",Toast.LENGTH_SHORT).show();
//				}
				
//				
//			}
//		});
		
		
	}



}
