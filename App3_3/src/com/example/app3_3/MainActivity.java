package com.example.app3_3;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	private ImageButton btnx;
	private ImageView ivxx;
	private RadioGroup rggender;
	private RadioButton rbman;
	private RadioButton rbwoman;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnx =(ImageButton)findViewById(R.id.ibtn);
		ivxx = (ImageView)findViewById(R.id.ivtn);
		
		rggender=(RadioGroup	)findViewById(R.id.rg);
		
		rbman = (RadioButton)findViewById(R.id.rbman);
		
		
		
		rggender.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				RadioButton rbs = (RadioButton)findViewById(checkedId);
				Toast.makeText(MainActivity.this, "当前选定："+rbs.getText(),Toast.LENGTH_SHORT).show();
				
				
				
			}
		});
		
		
		
		btnx.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Resources res = getResources();
				Bitmap bmp = BitmapFactory.decodeResource(res, R.drawable.fpp);
				ivxx.setImageBitmap(bmp);
				
				
				
			}
		});
	}
		
	public void btnclick(View view){
		
		Toast.makeText(this, "试试	", Toast.LENGTH_LONG).show();
	}

}
